package com.shinhan.day02;

import java.util.Scanner;

public class LAB2_Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. : ");
        int a = sc.nextInt();
        System.out.print("숫자를 입력하세요. : ");
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
