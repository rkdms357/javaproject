package com.shinhan.day09.q11;

public class q2 {
    //try{}에서 return문을 사용해도 finally{} 실행됨
    public static void main(String[] args) {
        int a = 10, b = 10;
        try {
            System.out.println(10 / 2);
            if (a == b) return;
            System.out.println("try...");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return;
        } finally {
            System.out.println("finally 반드시 처리함");
        }
        System.out.println("------Main End------");
    }
}