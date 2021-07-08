package com.BIO_Internet;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author=fionajoyo
 * @Date 2021/7/8 16:59
 * @Version 1.0
 */
public class MySocket extends Socket {
    public String getName() {
        return name;
    }

    private String name;

    public MySocket(String host, int port, String name) throws IOException {
        super(host, port);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
