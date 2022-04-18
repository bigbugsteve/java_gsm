/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gsm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class DeviceManager {
    private final String URL = "jdbc:sqlite:MobileShop.db";
    
    public List<Device> getAllDevices () {
        try {
            Statement statement = getStatement();
            String query = "SELECT m.IMEI, b.BrandName, m.Type, m.Screen, m.Camera, m.RAM, m.ROM, m.OperationSystem, m.Price \n"
                    + "FROM Mobiles AS m \n"
                    + "INNER JOIN Brands AS b\n"
                    + "ON m.BrandId == b.Id";
            
            List<Device> Devices = new ArrayList<>();
            boolean isQuery = statement.execute(query);
            
            ResultSet resultSet = statement.getResultSet();
            
            System.out.println(resultSet);
            while(resultSet.next()) {
                String brandName = resultSet.getString("BrandName");
                int imei = resultSet.getInt("IMEI");
                String type = resultSet.getString("Type");
                double screen = resultSet.getDouble("Screen");
                int camera = resultSet.getInt("Camera");
                int ram = resultSet.getInt("RAM");
                int rom = resultSet.getInt("ROM");
                String operationSystem = resultSet.getString("OperationSystem");
                int price = resultSet.getInt("Price");
                Device device = new Device(brandName, imei, type, screen, camera, ram, rom, operationSystem, price);
                Devices.add(device);
            }
            return Devices;
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    private Statement getStatement() throws SQLException {
        Connection connection = DriverManager.getConnection(URL);
        Statement statement = connection.createStatement();
        return statement;
    }
}
