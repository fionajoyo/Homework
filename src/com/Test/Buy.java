package com.Test;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;

/**
 * @Author=fionajoyo
 * @Date 2021/7/6 16:31
 * @Version 1.0
 */
public class Buy implements Runnable {
    private int count=10;
    private int num=0;
    @Override
    public void run()
    {
        while (true) {
            synchronized (this) {
                if (count <= 0) {
                    break;
                }
                count--;
                num++;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + num);
            }
        }
    }

    public synchronized boolean site()
    {
        Random r=new Random(1);
        int b;
        if(count<=0) {
            return false;
        }
        count--;
        num++;
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+num);

        return true;

    }
}
