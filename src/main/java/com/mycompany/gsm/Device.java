/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gsm;

import java.util.List;

/**
 *
 * @author user
 */
public class Device {
    private String brandName;
    private int imei;
    private String type;
    private double screen;
    private int camera;
    private int ram;
    private int rom;
    private String operationSystem;
    private int price;

    public Device (String brandName, int imei, String type, double screen, int camera, int ram, int rom, String operationSystem, int price) {
        this.brandName = brandName;
        this.imei = imei;
        this.type = type;
        this.screen = screen;
        this.camera = camera;
        this.ram = ram;
        this.rom = rom;
        this.operationSystem = operationSystem;
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Devices{" + "brandName=" + brandName + ", imei=" + imei + ", type=" + type + ", screen=" + screen + ", camera=" + camera + ", ram=" + ram + ", rom=" + rom + ", operationSystem=" + operationSystem + ", price=" + price + '}';
    }

    
}
