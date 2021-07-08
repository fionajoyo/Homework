package com.q0701;

/**
 * @Author=fionajoyo
 * @Date 2021/7/1 9:09
 * @Version 1.0
 */
public class  Computer {
    private String brand;
    private String type;
    private String memory;
    private String harddisk;
    private String monitor;
    private String cpu;
    private String battery="    ";
    private String chassistype="    ";
    private String price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getChassistype() {
        return chassistype;
    }

    public void setChassistype(String chassistype) {
        this.chassistype = chassistype;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
