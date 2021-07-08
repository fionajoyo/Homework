package com.q0705_2;


import javax.sound.midi.Soundbank;

/**
 * @Author=fionajoyo
 * @Date 2021/7/5 9:06
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        try {
            int []a=new int[10];
            System.out.println("a[9]="+a[9]);
            System.out.print("a[10]=");
            System.out.println();
            System.out.println(a[10]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("数组越界异常");
        }
        finally {

        }
    }
}
