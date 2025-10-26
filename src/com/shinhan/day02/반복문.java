package com.shinhan.day02;

import java.util.Scanner;

public class 반복문 {
    
    public static void main(String[] args) {
//        f1();
//        f2();
//        f3();
//        f4();
//        f5();
//        f6();
//        f7();
        ch4_3();
        ch4_4();
        ch4_5();
        ch4_6();
    }

    private static void ch4_6() {
        for(int row = 1; row <= 5; ++row) {
            for(int col = 1; col <= row; ++col) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row = 1; row <= 5; ++row) {
            for(int col = 1; col <= 6-row; ++col) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void ch4_5() {
        for(int x = 0; x <= 10; ++x) {
            for(int y = 0; y <= 10; ++y) {
                if(4 * x + 5 * y == 60) {
                    System.out.printf("(%d, %d) ", x, y);
                }
            }
        }
    }

    private static void ch4_4() {
        int a, b;
        do {
            a = (int)(Math.random()*(double)6.0F) + 1;
            b = (int)(Math.random()*(double)6.0F) + 1;
            System.out.printf("(%d, %d)\n", a, b);
        } while (a + b != 5);
    }

    private static void ch4_3() {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static void f7() {
        int score1;
        String grade = "B";
        label19:{
            score1 = 0;
            switch (grade) {
                case "A":
                    score1 = 100;
                    break label19;
                case "B":
                    int result = 80;
                    score1 = result;
                    break label19;
            }
            score1 = 60;
        }
        System.out.println(score1);
    }

    private static void f6() {
        int var10000;
        String grade = "A";
        label19:{
            int score1 = 0;
            switch (grade) {
                case "A":
                    var10000 = 100;
                    break label19;
                case "B":
                    int result = 80;
                    var10000 = result;
                    break label19;
            }
            var10000 = 60;
        }
        int var4 = var10000;
        System.out.println(var4);
    }

    private static void f5() {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        label19:while (run) {
            System.out.println("======================");
            System.out.println("1. 증속  2. 감속  3. 중지");
            System.out.println("======================");
            System.out.print("선택>>");
            int selectJob = sc.nextInt();
            switch (selectJob) {
                case 1:
                    ++speed;
                    System.out.println("증가함. 현재속도는 " + speed);
                    break;
                case 2:
                    --speed;
                    System.out.println("감소함. 현재속도는 " + speed);
                    break;
                case 3:
                    break label19;
            }
        }
        System.out.println("=========end==========");
        sc.close();
    }

    private static void f4() {
        for(int dan = 2; dan <= 9; dan++) {
            for(int gop = 1; gop <= 9; gop++) {
                if(dan != 4) {
                    System.out.printf("%-2d x %2d = %2d  ", dan, gop, dan * gop);
                }
            }
            System.out.println();
        }
    }

    private static void f3() {
        for(int dan = 2; dan <= 9; dan++) {
            for(int gop = 1; gop <= 9; gop++) {
                System.out.printf("%d x %d = %d\n", dan, gop, dan * gop);
                if(gop == 7) {
                    break;
                }
            }
        }
    }

    private static void f2() {
        int total = 0;
        int i = 1;
        do {
            System.out.println("반복 = " + i);
            total += i;
            ++i;
        } while(i <= 10);
        System.out.println("total = " + total);
        System.out.println("do-while수행후 i = " + i);
    }

    private static void f1() {
        int total = 0;
        int i;
        for(i = 1; i <=10; i++) {
            System.out.println("반복 = " + i);
            total += i;
        }
        System.out.println("total = " + total);
        System.out.println("for수행후 i = " + i);
    }
}