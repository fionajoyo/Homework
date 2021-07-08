package com.Internet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println(name + "等待连接，端口号：" + serverSocket.getLocalPort() + "...");
            Socket server = null;
            try {
                server = serverSocket.accept();
                System.out.println("远程主机地址:" + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("thanks for connecting");
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private ServerSocket serverSocket;
    private String name;
    Server(int port,String name)
    {
        this.name=name;
        try {
            serverSocket=new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Server s=new Server(6066,"sb");
        s.run();
    }

}
