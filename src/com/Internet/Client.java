package com.Internet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author=fionajoyo
 * @Date 2021/7/8 15:20
 * @Version 1.0
 */
public class Client {
    private  String host;
    private  int port;

    public Client(String host, int port) {
        this.host = host;
        this.port = port;
        try {
            socket=new Socket(host, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Socket socket;

    public static void main(String[] args) throws Exception {
        Socket client = new Socket("124.71.236.232", 6066);
        DataOutputStream dops=new DataOutputStream(client.getOutputStream());
        dops.writeUTF("Hello from "+client.getLocalAddress());
        DataInputStream dips=new DataInputStream(client.getInputStream());
        System.out.println("服务器响应:"+dips.readUTF());
        dops.flush();
        dips.close();
        dops.close();
        client.close();



    }

}
