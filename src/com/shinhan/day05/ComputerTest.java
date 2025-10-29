package com.shinhan.day05;

public class ComputerTest {
    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }

    private static void f3() {
        System.out.println(Computer.COMPANY);
        System.out.println(Computer.COMPANY2);
        System.out.println(Computer.getCnt());

        Computer aa = new Computer();
        System.out.println(aa.speed);
        System.out.println(aa.speed2);
        System.out.println(aa.speed3);
        System.out.println(aa.getSpeed4());
    }

    private static void f2() {
        String str2 = String.valueOf(true);
        System.out.println(str2);

        String str = new String("자바");
        char ch = str.charAt(0);
        System.out.println(ch);
    }

    private static void f1() {
        Computer c1 = new Computer();
        Computer c2 = new Computer("ABC");
        Computer c3 = new Computer("DDD", 100);
        c2.setModel("BBB");
        System.out.println(c2.getModel());
    }
}