package com.shinhan.day02;

import java.util.Scanner;

public class LAB3_Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("태어난 달을 입력하세요: ");
        int mon = sc.nextInt();
        printSeason(mon);
    }

    private static void printSeason(int mon) {
        switch (mon) {
            case 3, 4, 5 -> System.out.println("봄에 태어나셨네요.");
            case 6, 7, 8 -> System.out.println("여름에 태어나셨네요.");
            case 9, 10, 11 -> System.out.println("가을에 태어나셨네요");
            case 12, 1, 2 -> System.out.println("겨울에 태어나셨네요");
            default -> System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");
        }
    }
}
