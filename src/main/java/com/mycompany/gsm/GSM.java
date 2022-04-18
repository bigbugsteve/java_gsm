/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gsm;

import java.util.List;

/**
 *
 * @author user
 */
public class GSM {

    public static void main(String[] args) {
        System.out.println("Program start...");
        DeviceManager dm = new DeviceManager();
        
        List<Device> devices = dm.getAllDevices();
        
        for(Device device: devices) {
            System.out.println(device.toString());
        }
        
    }
}
