package com.q0701;

/**
 * @Author=fionajoyo
 * @Date 2021/7/1 9:14
 * @Version 1.0
 */
public class Desktop extends Computer {
    private String chassistype=" ";

    @Override
    public String getChassistype() {
        return chassistype;
    }

    @Override
    public void setChassistype(String chassistype) {
        this.chassistype = chassistype;
    }
}
