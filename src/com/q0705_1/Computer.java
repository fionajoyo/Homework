package com.q0705_1;



import java.util.Scanner;

/**
 * @Author=fionajoyo
 * @Date 2021/7/5 8:23
 * @Version 1.0
 */
public class Computer implements Assemble {
    @Override
    public String toString(){return "sb";}
    private String cpu;
    private String memory;
    private String hardDisk;

    @Override
    public void assembleCpu() {
        System.out.println("选择电脑的Cpu厂家：");
        System.out.println("1.Intel");
        System.out.println("2.AMD");
        System.out.println("3.IBM");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        switch (i)
        {
            case 1:cpu="Intel";break;
            case 2:cpu="AMD";break;
            case 3:cpu="IBM";break;
        }
        System.out.println("你选择cpu是："+cpu);

    }

    @Override
    public void assembleMemory() {
        System.out.println("选择电脑的内存厂家：");
        System.out.println("1.金士顿");
        System.out.println("2.海盗船");
        System.out.println("3.三星");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        switch (i)
        {
            case 1:memory="金士顿";break;
            case 2:memory="海盗船";break;
            case 3:memory="三星";break;
        }
        System.out.println("你选择内存是："+memory);


    }

    @Override
    public void assembleHarddisk() {
        System.out.println("选择电脑的硬盘厂家：");
        System.out.println("1.金士顿");
        System.out.println("2.西部数据");
        System.out.println("3.东芝");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        switch (i)
        {
            case 1:hardDisk="金士顿";break;
            case 2:hardDisk="西部数据";break;
            case 3:hardDisk="东芝";break;
        }
        System.out.println("你选择硬盘是："+hardDisk);


    }

    @Override
    public void showAssemble() {
        System.out.println("你组装的电脑配置：");
        System.out.println("CPU:"+cpu);
        System.out.println("内存:"+memory);
        System.out.println("硬盘:"+hardDisk);
    }
}
