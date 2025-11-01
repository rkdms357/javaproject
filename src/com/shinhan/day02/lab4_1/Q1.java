package com.shinhan.day02.lab4_1;

import java.util.Scanner;

public class Q1 {

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
        }
        if (total > 1000) {
            total += 2000;
        }
        System.out.printf("총합은 %d 입니다.", total);

        /*public static void main(String[] args) {
            System.out.print("초기값을 정수로 입력하세요. :");
            Scanner sc = new Scanner(System.in);
            int init = sc.nextInt();
            System.out.print("마지막 값을 정수로 입력하세요. :");
            int end = sc.nextInt();
            System.out.print("증가분을 정수로 입력하세요. :");
            int increase = sc.nextInt();

            int total = 0;
            for (int i = init; i <= end; i += increase) {
                total += i;
            }
            System.out.printf("총합은 %d 입니다.", total > 1000 ? total += 2000 : total);
         */
    }
}
