package com.BIO_Internet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @Author=fionajoyo
 * @Date 2021/7/8 16:19
 * @Version 1.0
 */
public class Client implements Runnable {

    @Override
    public void run()
    {
        int count=0;
        while (true)
        {
            t();
            count++;
            if (count>10)
            {break;}

        }


    }

    public synchronized void t()
    {
        Socket client = null;
        try {
            client = new Socket("localhost", 6066);
            DataOutputStream dops=new DataOutputStream(client.getOutputStream());
            dops.writeUTF("Hello from "+client.getLocalAddress());
            DataInputStream dips=new DataInputStream(client.getInputStream());
            System.out.println(""+dips.readUTF());
            dops.flush();
            dips.close();
            dops.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws IOException {
        Client c1=new Client();
        Client c2=new Client();
        Client c3=new Client();
        c1.run();
        c2.run();
        c3.run();
    }
}
