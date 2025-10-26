package com.shinhan.day02;

import java.util.Scanner;

public class 조건문 {
    public static void main(String[] args) {
        // f1();
        // f2();
        //f3();
        //f4();
        //f5();
        f6();
    }
    private static void f6() {
        String grade = "B";
        int score = 0;
        switch(grade) {
            case "A":score =100;break;
            case "B":{
                int result = 100-20;
                score=result;break;
            }
            default:score=60;

        }
        System.out.printf("11이전버전 : 점수는 %d, 학점은 %s\n", score, grade);

        score = switch(grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100-20;
                yield result;
            }
            default -> 60;

        };
        System.out.printf("13버전부터 : 점수는 %d, 학점은 %s\n", score, grade);
    }
//    private static void f5() {
//        int score = 100;
//        char score2 = 'A';
//        //switch문에서 ()의 결과가 실수 타입 불가
//        double c = 3.14;
//        String score3 = "A";
//        switch(score3) {
//        }
//    }
    private static void f4() {
        //변이 6개인 주사위를 던져서 임의의 숫자가 나옴
        double a = Math.random(); // 0<= <1
        System.out.println(a);
        int b = (int)(Math.random()*6+1);
        System.out.println(b); //1<= <=6
        //로또 번호를 무작위로 만들기 1<= <=45
        int c = (int)(Math.random()*45)+1;
        System.out.println(c);
    }
    private static void f3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("(switch)점수>>");
        int score = sc.nextInt();
        char grade;
        // 점수에 따라 학점 부여
        // 90이상이면 'A'학점
        // 80이상이면 'B'
        // 70이상이면 'C'
        // 60이상이면 'D'
        // 나머지는 'F'
        // 가능: case 값1, 값2
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A'; break;
            case 8:
                grade = 'B'; break;
            case 7:
                grade = 'C'; break;
            case 6:
                grade = 'D'; break;
            default:
                grade = 'F';
        }
        System.out.printf("1.당신의 점수는 %d이고 학점은 %s\n", score, grade);

        switch (score / 10) {
            case 10,9 -> {grade='A';}
            case 8 -> grade = 'B';
            case 7 -> grade = 'C';
            case 6 -> grade = 'D';
            default -> grade = 'F';
        }
        System.out.printf("2.당신의 점수는 %d이고 학점은 %s\n", score, grade);
        sc.close();
        System.out.println("-------------------");
    }
    private static void f2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수>>");
        int score = sc.nextInt();
        char grade;
        // 점수에 따라 학점 부여
        // 90이상이면 'A'학점
        // 80이상이면 'B'
        // 70이상이면 'C'
        // 60이상이면 'D'
        // 나머지는 'F'
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
        System.out.printf("당신의 점수는 %d이고 학점은 %s\n", score, grade);
        sc.close();
        System.out.println("-------------------");
    }
    private static void f1() {
        // 표준입력(키보드)
        Scanner sc = new Scanner(System.in);
        System.out.print("점수>>");
        int score = sc.nextInt();
        // 점수가 70이상이면 합격
        // 1.삼항연산자
        System.out.println(score >= 70 ? "합격" : "ㅠㅠ");
        // 2.조건문
        if (score >= 70) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
        sc.close();
        System.out.println("-------------------");
    }
}