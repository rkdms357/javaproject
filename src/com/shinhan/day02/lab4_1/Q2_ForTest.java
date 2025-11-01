package com.shinhan.day02.lab4_1;

import java.util.Scanner;

public class Q2_ForTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요. : ");
        String str = sc.nextLine().toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요. : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Character.toUpperCase(str.charAt(j)));
            }
            System.out.println();
        }
    }
     */
}
