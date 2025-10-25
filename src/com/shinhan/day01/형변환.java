package com.shinhan.day01;

public class 형변환 {

    public static void main(String[] args) {
        f1();
        f2();
        f3();
        f4();
        f5();
        f6();
    }

    private static void f6() {
        String s1 = "100";
        String s2 = "200";
        String s3 = "100.5";
        String s4 = "200.4";
        String s5 = "true";
        System.out.println(s1 + s2);
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
        System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));
        System.out.println(Boolean.parseBoolean(s5) == false);

        int i = 100;
        String str1 = i + "";
        String str2 = String.valueOf(i);
        System.out.println(str1 + ":" + str2);
    }

    private static void f5() {
        //작은타입 연산자 큰타입 -> 큰타입으로 자동형변환
        //문자 + 숫자 -> 문자로 변환
    }

    //연산식에서 정수의 기본은 int
    private static void f4() {
        byte var1 = 10;
        byte var2 = 20;
        int var3 = var1 + var2;
        byte var4 = (byte)var3;
        int var5 = 10;
        int var6 = 20;
        int var7 = var1 + var2;
    }

    private static void f3() {
        double var7 = 3.94;
        int var8 = (int)var7;
        System.out.println(var8);

        int total = 278;
        int subject = 3;
        //double result = total*1.0 / subject
        double result = (double)total/subject;
        System.out.println(result);
    }

    private static void f2() {
        //2. 강제형변환: 작은 방 = 큰 값. 값 손실 가능성 있음
        int var1;
        byte var2 = 100;
        char var3 = 'A';
        long var4 = 2147483649L;
        var1 = (int)var4; //강제형변환
        System.out.println(var1); //-2147483647 -> 오버플로우 발생해 원하는 값 안나옴
    }

    private static void f1() {
        //1. 자동형변환: 큰방 = 작은 값
        int var1;
        byte var2 = 100;
        char var3 = 'A'; //'A' -> 65 'a' -> 97
        long var4 = 200; //자동형변환
        var1 = var2;
        var1 = var3;
        //var1 = var4; //자동형변환 불가
        System.out.println(var1);
    }
}
