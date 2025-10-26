package com.shinhan.day02;

import java.util.Scanner;

public class LAB2_Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2 ~ 100사이의 정수를 입력하세요. : ");
        int num = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        } if (cnt > 2) {
            System.out.printf("%d는(은) 소수가 아닙니다.)", num);
        } else {
            System.out.printf("%d는(은) 소수입니다.", num);
        }
    }
}
