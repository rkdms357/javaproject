package com.shinhan.day09.q12;

public class MathExample {
    public static void main(String[] args) {
        double a = Math.ceil(3.1); //소수첫번째 자리에서 무조건 1의 자리로 올림
        System.out.println(a); //4.0
        double b = Math.floor(3.9); //소수점 아래의 모든값 버림
        System.out.println(b); //3.0
        long c = Math.round(5.7); //반올림, 실수->정수
        System.out.println(c); //6
    }
}