package com.shinhan.day02;

import java.util.Scanner;

public class LAB2_Q1_Prob1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
            int dan = sc.nextInt();
            if (dan < 2 || dan > 9) {
                System.out.println("잘못된 숫자가 입력되었습니다.");
                break;
            } else {
                for (int gop = 1; gop <= 9; gop++) {
                    System.out.printf("%d * %d = %d\n", dan, gop, dan * gop);
                }
                break;
            }
        }
        sc.close();
    }
}
