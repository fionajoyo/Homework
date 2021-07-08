package com.BIO_Internet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;
import java.sql.PreparedStatement;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author=fionajoyo
 * @Date 2021/7/8 16:19
 * @Version 1.0
 */
public class Server  {
    ServerSocket serverSocket=null;
    private int port;

    Server(int port) throws IOException
    {
        this.port= port;
        serverSocket=new ServerSocket(this.port);

    }


    static class Handler implements Runnable
    {
        static int num=0;
        public Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }
        public synchronized  void t()
        {

            num++;
            System.out.println("进程" + num + "创建，用于处理" + socket.getLocalAddress());
            try {
                DataInputStream in=new DataInputStream(socket.getInputStream());
                DataOutputStream out =new DataOutputStream(socket.getOutputStream());
                System.out.println(socket.getLocalAddress()+"指令:"+in.readUTF());
                out.writeUTF(socket.getRemoteSocketAddress()+":服务器响应");
                out.flush();
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

        @Override
        public void run()
        {

               t();



        }
    }


    public static void main(String[] args) throws IOException {
        ServerSocket s=new ServerSocket(6066);
        System.out.println("Server start");
        ExecutorService service = Executors.newFixedThreadPool(50);
        while (true)
        {
            Socket temp=s.accept();

            service.execute(new Handler(temp));

        }




    }
}
