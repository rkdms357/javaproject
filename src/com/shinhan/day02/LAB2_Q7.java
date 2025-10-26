package com.shinhan.day02;

import java.util.Scanner;

public class LAB2_Q7 {

    public static void main(String[] args) {
        numDay(4);
        numDay(2);
        numDay(1);
        numDay(13);
    }

    private static void numDay(int mon) {
        if (mon < 1 || mon > 12) {
            System.out.printf("%d월은 존재하지 않습니다. 다시 입력하세요.", mon);
        } else {
            int result;
            switch (mon) {
                case 4, 6, 9, 11 -> result = 30;
                case 2 -> result = 28;
                default -> result = 31;
            }
            System.out.println(result);
        }
    }
}
