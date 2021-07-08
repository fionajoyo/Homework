package com.q0705_3;

/**
 * @Author=fionajoyo
 * @Date 2021/7/5 9:25
 * @Version 1.0
 */
public abstract class Person {
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
