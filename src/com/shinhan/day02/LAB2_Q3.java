package com.shinhan.day02;

import java.util.Scanner;

public class LAB2_Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
            int num = sc.nextInt();
            if (num < 2 || num > 9) {
                System.out.println("잘못된 숫자가 입력되었습니다.");
                break;
            } else {
                for (int i = 1; i <= num; i++) {
                    System.out.printf("%d ! = %d\n", i, factorial(i));
                }
                break;
            }
        }
        sc.close();
    }

    private static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}
