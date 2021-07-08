package com.q0705_1;

import java.sql.SQLOutput;

/**
 * @Author=fionajoyo
 * @Date 2021/7/5 8:59
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args)
    {
        System.out.println("欢迎使用电脑组装系统");
        Computer c=new Computer();
        Assemble a=c;
        a.assembleCpu();
        a.assembleMemory();
        a.assembleHarddisk();
        a.showAssemble();


    }

}
