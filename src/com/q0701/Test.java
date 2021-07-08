package com.q0701;
import com.q0701.Shop;

import java.util.Scanner;

/**
 * @Author=fionajoyo
 * @Date 2021/7/1 10:11
 * @Version 1.0
 */
public class Test {
    public static  void main(String[] args)
    {
        Shop sp = new Shop();
        sp.addComputer();
        System.out.println("输入你要干嘛： 1、查看电脑信息    2、 购买电脑信息");
        Scanner sc=new Scanner(System.in);
        while (true)
        {
        int i=sc.nextInt();
        switch (i) {

            case 0:return;
            case 1:sp.showList();break;
            case 2:sp.buyComputer();break;
        }
    }}



}
