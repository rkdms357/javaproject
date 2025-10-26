package com.shinhan.day02;

public class LAB2_Q5 {

    public static void main(String[] args) {
        int result = 0;
        int cur = 1;
        int diff = 1;
        for (int i = 1; i <= 15; i++) {
            result += cur;
            cur += diff;
            diff++;
        }
        System.out.println("15번째까지의 합 : " + result);
    }
}
