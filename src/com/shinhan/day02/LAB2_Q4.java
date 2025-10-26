package com.shinhan.day02;

import java.util.Scanner;

public class LAB2_Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int cnt = 0;
        int total = 0;
        for (int i = num; i <= 1000; i += num) {
            if (i % num == 0) {
                cnt++;
                total += i;
            }
        }
        System.out.printf("%d의 배수 개수 = %d\n", num, cnt);
        System.out.printf("%d의 배수 합 = %d", num, total);
    }
}
