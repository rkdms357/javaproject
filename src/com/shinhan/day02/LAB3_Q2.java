package com.shinhan.day02;

import java.util.Scanner;

public class LAB3_Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. : ");
        int a = sc.nextInt();
        System.out.print("숫자를 입력하세요. : ");
        int b = sc.nextInt();
        System.out.println(abs(a, b));
    }

    private static int abs(int a, int b) {
        int result = a - b;
        return result < 0 ? -result : result;
    }
}
