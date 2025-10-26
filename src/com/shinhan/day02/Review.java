package com.shinhan.day02;

public class Review {

    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q8();
        q9();
        q10();
    }

    private static void q10() {
        String s = "123";
        System.out.println(s + "200");
        System.out.println(Integer.parseInt(s) + 200);

        char ch1 = s.charAt(0);
        char ch2 = s.charAt(1);
        char ch3 = s.charAt(2);
        System.out.println(ch1 + ch2 + ch3); //150
        System.out.println(49);
        System.out.println(50);
        System.out.println(51);

        char ch4 = 'A';
        System.out.println(ch4);
        System.out.println(97);
        System.out.println(Character.toLowerCase(ch4)); //a
    }

    private static void q9() {
        byte bv = 10;
        float fv = 2.5F;
        double dv = (double)2.5F;
        byte r1 = (byte)(bv + bv);
        int r2 = 5 + bv;
        float r3 = 5.0F + fv;
        double r4 = (double)5.0F + dv;
        System.out.println(r4);
    }

    private static void q8() {
        System.out.println("a");
        System.out.print("b");
        System.out.println("c");
        int score = 99;
        System.out.printf("score = %d", score);
        System.out.println("값 변경이 아님: " + score);
    }

    private static void q4() {
        int var1 = 10;
        long var2 = 10000000000L;
        char var3 = ' ';
        float var4 = 10.0F;
        String var5 = "abc\ndef";
        String var6 = "abc\ndef\n";
        System.out.println(var5);
    }

    private static void q3() {
        int iv = 10;
        char cv = 'A';
        double dv = 5.7;
        String sv = "A";
        double v1 = (double)iv;
        byte v2 = (byte)iv;
        int v3 = (int)dv;
        char v4 = sv.charAt(0);
        System.out.println(v4);
    }

    private static void q2() {
        short a = -32765;
        char b = 'A';
        b = (char)a;
        System.out.println(b);
    }

    private static void q1() {
        int[] var10000 = new int[]{10, 20, 30};
        int var1 = 100;
        System.out.println("var1 = " + var1);
    }
}