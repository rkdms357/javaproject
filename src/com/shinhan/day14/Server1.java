package com.shinhan.day14;

import java.io.*;
import java.net.*;

public class Server1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(50001);
        System.out.println("---서버가 시작됨---");
        Socket socket = serverSocket.accept();
        InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
        System.out.println(socketAddress.getAddress().getHostName());
        System.out.println(socketAddress.getAddress().getHostAddress());

        byte[] bytes = null;
        String message = null;

        //데이터 보내기
        OutputStream os = socket.getOutputStream();
        message = "Hello Client(Server가 데이터 보내기)";
        bytes = message.getBytes("UTF-8");
        os.write(bytes);
        os.flush();
        System.out.println("[Server가 데이터 보내기 성공]");

        //읽기
        InputStream is = socket.getInputStream();
        bytes = new byte[100];
        int readByteCount = is.read(bytes); // blocking
        message = new String(bytes, 0, readByteCount, "UTF-8");
        System.out.println("[Server가 데이터 받기 성공] " + message);
        serverSocket.close();
    }
}