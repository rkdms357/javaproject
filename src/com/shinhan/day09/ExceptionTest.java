package com.shinhan.day09;

import java.io.IOException;
import java.io.InputStream;

//cmd>java ExceptionTest
//JVM은 클래스를 load함
//문제가 있는지 검증함
//main시작...main이 끝나면 종료
public class ExceptionTest {

    public static void main(String[] args) throws ClassNotFoundException {
        f1();
        System.out.println("------main End------");
        f2();
        System.out.println("------main End------");
        f3();
        System.out.println("------main End------");
        f4(); //떠넘기고 메인함수로 옴..메인도 떠넘김..JVM이 예외를 발생시키고 프로그램이 중지됨
        System.out.println("------main End------"); //이건 출력안됨
    }

    //2. 떠넘김
    //자동 Exception발생
    //일반 Exception은 처리 안하고 떠넘김 -> 나를 호출한 곳으로 감
    private static void f4() throws ClassNotFoundException {
        Class.forName("AA");
        System.out.println("------f4 End------");
    }

    //1. 내가 처리함
    private static void f3() {
        try {
            Class.forName("com.shinhan.day08.Book");
            System.out.println("------load success------");
        } catch (ClassNotFoundException e) {
            System.out.println("------load fail------");
            e.printStackTrace();
        }
        System.out.println("------f3 End------");
    }

    //일반예외(Exception 상속받은 예외발생): 컴파일시에 Check함
    //에러가 나도 프로그램이 중단 안됨
    //해결방법 1. 내가 처리함
    //해결방법 2. 떠넘김
    private static void f2() {
        InputStream is = System.in;
        int data;
        //1. 내가 처리함
        //예외발생 가능성 있는 문장 기술
        try {
            data = is.read();
            System.out.println("읽은 값: " + (char)data);
        }
        catch (IOException e) {
            System.out.println("예외발생시에 수행");
            e.printStackTrace();
        } finally {
            System.out.println("이 부분은 예외발생 여부 상관없이 반드시 수행");
        }
        System.out.println("------f2 End------");
    }

    //RuntimeException 컴파일시에 Unchecked
    private static void f1() {
        System.out.println(10 / 0); //정수는 0으로 못 나눔
        //컴파일시에는 검증하지 않고 실행시에 에러로 프로그램이 중단됨
        System.out.println("------f1 End------");
    }
}
