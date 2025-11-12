package com.shinhan.day14;

import java.io.*;
import java.net.*;

public class Client1 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket = new Socket("192.168.0.45", 50001);
        System.out.println("(Client)서버에 접속함");

        byte[] bytes = null;
        String message = null;
        //읽기
        InputStream is = socket.getInputStream();
        bytes = new byte[100];
        int readByteCount = is.read(bytes); // blocking
        message = new String(bytes, 0, readByteCount, "UTF-8");
        System.out.println("[client가 데이터 받기 성공] " + message);

        //데이터 보내기
        OutputStream os = socket.getOutputStream();
        message = "Hello Server(client가 데이터 보내기)";
        bytes = message.getBytes("UTF-8");
        os.write(bytes);
        os.flush();
        System.out.println("[client가 데이터 보내기 성공]");


        socket.close();
    }
}