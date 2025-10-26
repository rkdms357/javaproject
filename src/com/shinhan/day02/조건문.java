package com.shinhan.day02;

import java.util.Scanner;

public class 조건문 {

    public static void main(String[] args) {
        //f1();
        //f2();
        //f3();
        f4();
        f5();
        f6();
    }

    private static void f6() {
        int score;
        String grade;
        label35: {
            grade = "B";
            score = 0;
            switch (grade) {
                case "A":
                    score = 100;
                    break label35;
                case "B":
                    int result = 80;
                    score = result;
                    break label35;
            }
            score = 60;
        }

        int var10000;
        label27: {
            System.out.printf("11이전버전: 점수는 %d, 학점은 %s\n", score, grade);
            switch (grade) {
                case "A":
                    var10000 = 100;
                    break label27;
                case "B":
                    int result = 80;
                    var10000 = result;
                    break label27;
            }
            var10000 = 60;
        }
        score = var10000;
        System.out.printf("13버전부터: 점수는 %d, 학점은 %s\n", score, grade);
    }

    private static void f5() {
        int score = 100;
        char score2 = 'A';
        double c = 3.14;
        String score3 = "A";
        System.out.println(score3.hashCode());
    }

    //Math.random() → 0.0 <  < 1.0 사이의 난수(double) 반환
    private static void f4() {
        double a = Math.random();
        System.out.println(a);
        int b = (int)(Math.random()*(double)6.0F + (double)1.0F);
        System.out.println(b);
        int c = (int)(Math.random()*(double)45.0F) + 1; //로또 번호
        System.out.println(c);
    }

    private static void f3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("(switch)점수>>");
        int score = sc.nextInt();
        char grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.printf("당신의 점수는 %d이고 학점은 %s\n", score, grade);
        sc.close();
        System.out.println("--------------------------");
    }

    private static void f2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수>>");
        int score = sc.nextInt();
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.printf("당신의 점수는 %d이고 학점은 %s", score, grade);
        sc.close();
        System.out.println("\n------------------------------");
    }

    private static void f1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수>>");
        int score = sc.nextInt();
        System.out.println(score >= 70 ? "합격" : "ㅠㅠ");
        if (score >= 70) {
            System.out.println("합격");
        } else {
            System.out.println("ㅠㅠ");
        }
        sc.close();
        System.out.println("-----------------------");
    }
}
