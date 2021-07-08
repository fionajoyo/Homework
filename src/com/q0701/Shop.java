package com.q0701;

import javax.swing.border.CompoundBorder;
import java.util.Scanner;

/**
 * @Author=fionajoyo
 * @Date 2021/7/1 9:20
 * @Version 1.0
 */
public class Shop implements computerset {
    Computer[] c = new Computer[10];
    private int sum = 0;
    public void buyComputer()
    {
        System.out.println("根据序号选择你想买的电脑");
        showList();
        System.out.println("请输入：");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println("你要购买的是"+c[i-1].getBrand()+c[i-1].getType()+"电脑");
        System.out.println("请选择你的支付方式：");
        System.out.println("1、完整支付    2、分期支付");
        int j=sc.nextInt();
        switch (j)
        {
            case 0:return;
            case 1:
                System.out.println("你选择的是完整支付，价格是："+c[i-1].getPrice()+"元  可以赠品（1.鼠标 2.u盘）");
                int k=sc.nextInt();
                switch (k)
                {
                    case 0:return;
                    case 1:System.out.println("恭喜你购买了"+c[i-1].getBrand()+c[i-1].getType()+
                            " 价格为"+c[i-1].getPrice()+"元  赠品为：鼠标");break;
                    case 2:System.out.println("恭喜你购买了"+c[i-1].getBrand()+c[i-1].getType()+
                            " 价格为"+c[i-1].getPrice()+"元  赠品为：u盘");break;
                }
                break;
            case 2:
                System.out.println("你选择的是分期支付，价格是："+c[i-1].getPrice()+"元  可以选择分多少期（1. 12期  2.24期）");
                k=sc.nextInt();
                switch (k)
                {
                    case 0:return;
                    case 1:System.out.println("恭喜你购买了"+c[i-1].getBrand()+c[i-1].getType()+
                            " 价格为"+c[i-1].getPrice()+"元  分期方式：12期");break;
                    case 2:System.out.println("恭喜你购买了"+c[i-1].getBrand()+c[i-1].getType()+
                            " 价格为"+c[i-1].getPrice()+"元  分期方式：24期");break;
                }
                break;
        }
    }

    public void addComputer() {
        System.out.println("请输入你想加的电脑类型：");
        System.out.println("0.退出");
        System.out.println("1.台式机");
        System.out.println("2.笔记本");
        while (true) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i) {
                case 0:
                    return;
                case 1:
                    setDesktop();
                    break;
                case 2:
                    setLaptop();
                    break;
            }
        }
    }

    @Override
    public void setLaptop() {
        Scanner sc = new Scanner(System.in);
        if (sum < 10) {
            c[sum]=new Computer();
            System.out.println("依次输入品牌   类型     内存   硬盘   显示器     CPU   电池     价格");
            v(sc);
            String s = sc.next();
            c[sum].setBattery(s);
            s = sc.next();
            c[sum++].setPrice(s);
        } else {
            System.out.println("电脑库满了");
        }


    }

    @Override
    public void setDesktop() {
        Scanner sc = new Scanner(System.in);
        if (sum < 10) {
            c[sum]=new Computer();
            System.out.println("依次输入品牌   类型     内存   硬盘   显示器     CPU   机箱    价格");
            v(sc);
            String s = sc.next();
            c[sum].setChassistype(s);
            s = sc.next();
            c[sum++].setPrice(s);
        } else {
            System.out.println("电脑库满了");
        }

    }

    private void v(Scanner sc) {
        String s = sc.next();
        c[sum].setBrand(s);
        s = sc.next();
        c[sum].setType(s);
        s = sc.next();
        c[sum].setMemory(s);
        s = sc.next();
        c[sum].setHarddisk(s);
        s = sc.next();
        c[sum].setMonitor(s);
        s = sc.next();
        c[sum].setCpu(s);

    }


    public void showList() {
        System.out.println("序号     品牌   类型     内存   硬盘   显示器     CPU   电池    机箱    价格（元）");
        for (int i = 0; i < sum; i++) {
            System.out.print((i + 1) + "     " + c[i].getBrand() + "     " + c[i].getType() + "     " + c[i].getMemory() + "   " +
                    "  " + c[i].getHarddisk() + "     " + c[i].getMonitor() + "     " + c[i].getCpu() + "     " + c[i].getBattery() + "     "
                    + c[i].getChassistype() + "     " + c[i].getPrice());
            System.out.println();
        }
    }
}