package com.q0701;

/**
 * @Author=fionajoyo
 * @Date 2021/7/1 9:14
 * @Version 1.0
 */
public class Laptop extends Computer{
    private String batterytype=" ";

    public String getBatterytype() {
        return batterytype;
    }

    public void setBatterytype(String batterytype) {
        this.batterytype = batterytype;
    }
}
