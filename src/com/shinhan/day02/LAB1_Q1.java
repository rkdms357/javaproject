package com.shinhan.day02;

import java.util.Scanner;

public class LAB1_Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("초기값을 정수로 입력하세요.: ");
        int init = sc.nextInt();
        System.out.print("마지막 값을 정수로 입력하세요.: ");
        int fin = sc.nextInt();
        System.out.print("증가분을 정수로 입력하세요.: ");
        int incr = sc.nextInt();

        int total = 0;
        int i = init;
        while (i <= fin) {
            total += i;
            i += incr;
        } if (total > 1000) {
            total += 2000;
        }
        System.out.printf("총합은 %d 입니다.", total);
    }
}
