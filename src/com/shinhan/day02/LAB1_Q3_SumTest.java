package com.shinhan.day02;

import java.util.Scanner;

public class LAB1_Q3_SumTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. : ");
        int num = sc.nextInt();
        int result = 0;
        //a. 입력 받은 숫자가 홀수인 경우
        if (num % 2 != 0) {
            for (int i = 1; i <= num; i += 2) {
                result += i;
            }
        }
        //b. 입력 받은 숫자가 짝수인 경우
        else {
            for (int i = 0; i <= num; i += 2) {
                result += i;
            }
        }
        System.out.println("결과 값 : " + result);
    }
}
