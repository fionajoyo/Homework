package com.q0705_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author=fionajoyo
 * @Date 2021/7/5 9:23
 * @Version 1.0
 */
public class Manger {

    private ArrayList<Classmate> l1=new ArrayList<Classmate>();
    private ArrayList<Friend> l2=new ArrayList<Friend>();
    private ArrayList<Family> l3=new ArrayList<Family>();

    public void addPerson()
    {
        while (true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("输入你想加入人的姓名:");
            String name=sc.next();
            System.out.println("输入你想加入人的电话:");
            String phoneNumber=sc.next();
            System.out.println("输入你想加入的人类型：");
            System.out.println("0.退出");
            System.out.println("1.同学");
            System.out.println("2.朋友");
            System.out.println("3.家人");
            int i=sc.nextInt();

            switch (i)
            {
                case 0:return;
                case 1:
                    Classmate c=new Classmate();
                    c.setName(name);
                    c.setPhoneNumber(phoneNumber);
                    l1.add(c);
                    break;
                case 2:Friend f=new Friend();
                    f.setName(name);
                    f.setPhoneNumber(phoneNumber);
                    l2.add(f);;break;
                case 3:Family fy=new Family();
                    fy.setName(name);
                    fy.setPhoneNumber(phoneNumber);
                    l3.add(fy);;break;
            }
        }
    }

    public void searchPerson()
    {
        while (true)
        {
            String name = null;
            String phoneNumber=null;
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你想查找的类型：");
            System.out.println("0.退出");
            System.out.println("1.姓名查找");
            System.out.println("2.电话号码查找");
            int i=sc.nextInt();
            if(i==1)
            {
                System.out.println("输入你想查找的姓名");
                name=sc.next();
            }
            else
            {
                System.out.println("输入你想查找的号码");
                phoneNumber=sc.next();
            }
            System.out.println("请输入你想查找的方式");
            System.out.println("1.总查找");
            System.out.println("2.分类查找");
            int j=sc.nextInt();
            int k;
            if(j==2)
            {
                System.out.println("请输入你想查找的类型");
                System.out.println("1.同学");
                System.out.println("2.朋友");
                System.out.println("3.家人");
                k=sc.nextInt();
            }
            else
                {
                k=0;
            }
            switch (i)
            {
                case 0:return;
                case 1:
                    switch (j)
                    {
                        case 0:return;
                        case 1:
                            for(Classmate c:l1)
                            {
                                if(c.getName().equals(name))
                                {
                                    System.out.println("分类：同学");
                                    System.out.println("姓名:"+name);
                                    System.out.println("电话:"+c.getPhoneNumber());
                                }
                            }
                            for(Friend f:l2)
                            {
                                if(f.getName().equals(name))
                                {
                                    System.out.println("分类：朋友");
                                    System.out.println("姓名:"+name);
                                    System.out.println("电话:"+f.getPhoneNumber());
                                }
                            }
                            for(Family f:l3)
                            {
                                if(f.getName().equals(name))
                                {
                                    System.out.println("分类：家人");
                                    System.out.println("姓名:"+name);
                                    System.out.println("电话:"+f.getPhoneNumber());
                                }
                            }
                            break;

                        case 2:
                            switch (k)
                            {
                                case 1:
                                    for(Classmate c:l1)
                                    {
                                        if(c.getName().equals(name))
                                        {
                                            System.out.println("根据同学分类查找");
                                            System.out.println("姓名:"+name);
                                            System.out.println("电话:"+c.getPhoneNumber());
                                        }
                                    }
                                    break;
                                case 2:
                                    for(Friend f:l2)
                                    {
                                        if(f.getName().equals(name))
                                        {
                                            System.out.println("根据朋友分类查找");
                                            System.out.println("姓名:"+name);
                                            System.out.println("电话:"+f.getPhoneNumber());
                                        }
                                    }
                                    break;
                                case 3:
                                    for(Family f:l3)
                                    {
                                        if(f.getName().equals(name))
                                        {
                                            System.out.println("根据家人分类查找");
                                            System.out.println("姓名:"+name);
                                            System.out.println("电话:"+f.getPhoneNumber());
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    switch (j)
                    {
                        case 0:return;
                        case 1:
                                    for(Classmate c:l1)
                                    {
                                        if(c.getPhoneNumber().equals(phoneNumber))
                                        {
                                            System.out.println("分类：同学");
                                            System.out.println("姓名:"+c.getName());
                                            System.out.println("电话:"+c.getPhoneNumber());
                                        }
                                    }
                                    for(Friend f:l2)
                                    {
                                        if(f.getPhoneNumber().equals(phoneNumber))
                                        {
                                            System.out.println("分类：朋友");
                                            System.out.println("姓名:"+f.getName());
                                            System.out.println("电话:"+f.getPhoneNumber());
                                        }
                                    }
                                    for(Family f:l3)
                                    {
                                        if(f.getPhoneNumber().equals(phoneNumber))
                                        {
                                            System.out.println("分类：家人");
                                            System.out.println("姓名:"+f.getName());
                                            System.out.println("电话:"+f.getPhoneNumber());
                                        }
                                    }
                                    break;
                        case 2:
                            switch (k)
                            {
                                case 1:
                                    for(Classmate c:l1)
                                    {
                                        if(c.getPhoneNumber().equals(phoneNumber))
                                        {
                                            System.out.println("根据同学分类查找");
                                            System.out.println("姓名:"+c.getName());
                                            System.out.println("电话:"+c.getPhoneNumber());
                                        }
                                    }
                                    break;
                                case 2:
                                    for(Friend f:l2)
                                    {
                                        if(f.getPhoneNumber().equals(phoneNumber))
                                        {
                                            System.out.println("根据朋友分类查找");
                                            System.out.println("姓名:"+f.getName());
                                            System.out.println("电话:"+f.getPhoneNumber());
                                        }
                                    }
                                    break;
                                case 3:
                                    for(Family f:l3)
                                    {
                                        if(f.getPhoneNumber().equals(phoneNumber))
                                        {
                                            System.out.println("根据家人分类查找");
                                            System.out.println("姓名:"+f.getName());
                                            System.out.println("电话:"+f.getPhoneNumber());
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
            }
        }
    }
    public void showPerson()
    {
        System.out.println("同学-----------------------------------");
        for(Classmate c:l1)
        {
            System.out.println("姓名："+c.getName());
            System.out.println("电话："+c.getPhoneNumber());
        }
        System.out.println("-------------------------------------");
        System.out.println("朋友-----------------------------------");
        for(Friend c:l2)
        {
            System.out.println("姓名："+c.getName());
            System.out.println("电话："+c.getPhoneNumber());
        }
        System.out.println("-------------------------------------");
        System.out.println("家人-----------------------------------");
        for(Family c:l3)
        {
            System.out.println("姓名："+c.getName());
            System.out.println("电话："+c.getPhoneNumber());
        }
        System.out.println("-------------------------------------");



    }
}
