package com.shinhan.day15.q18;

import java.io.*;

public class IOExample {
    public static void main(String[] args) {
        String fileName = "./src/com/shinhan/day14/NetworkTest.java";
        //1)FileReader로 문자 단위 읽기
        try (FileReader fr = new FileReader(fileName)) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data); // 숫자(유니코드) → 문자로 출력
            }
            System.out.println("\n\n===== 문자 단위 읽기 끝 =====\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2)BufferedReader로 줄 단위 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int lineNumber = 0;
            String line;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                System.out.printf("%3d: %s%n", lineNumber, line);
            }
            System.out.println("라인 수: " + lineNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}