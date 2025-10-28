package com.shinhan.day04;

import java.util.Scanner;

enum Grade {
    A, B, C, D, F
}

public class LAB3 {
    static Scanner sc = new Scanner(System.in);
    static String[] names; //학생 이름 저장
    static int[] scores; //학생 점수 저장
    static Grade[] grades; //enum을 사용하여 성적 등급 저장

    public static void main(String[] args) {
        boolean isContinue = false;
        while (!isContinue) {
            menuDisplay();
            int selectJob = sc.nextInt();
            switch (selectJob) {
                case 1 -> {
                    f_input();
                }
                case 2 -> {
                    f_select();
                }
                case 3 -> {
                    f_search();
                }
                case 4 -> {
                    f_average();
                }
                case 5 -> {
                    f_scoreFind();
                }
                case 6 -> {
                    isContinue = true;
                }
            }
        }
        sc.close();
        System.out.println("프로그램을 종료합니다.");
    }

    private static void f_scoreFind() {
        System.out.print("기준 점수를 입력하세요: ");
        int findScore = sc.nextInt();
        System.out.printf("===%d점 이상 학생 목록===\n", findScore);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= findScore) {
                System.out.printf("%s - 점수: %d, 등급: %s\n", names[i], scores[i], grades[i]);
            }
        }
    }

    private static void f_average() {
        if (!processCheck()) {
            return;
        }
        int total = 0;
        for (int data : scores) {
            total += data;
        }
        double average = (double) total / names.length;
        System.out.printf("전체 학생의 평균 점수: %3.1f\n", average);
    }

    private static void f_search() {
        if (!processCheck()) {
            return;
        }
        int maxScore = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
                idx = i;
            }
        }
        System.out.println("최고 점수를 받은 학생: " + names[idx]);
    }

    private static void f_select() {
        if (!processCheck()) {
            return;
        }
        System.out.println("===학생 성적 목록===");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s - 점수: %d, 등급: %s\n", names[i], scores[i], grades[i]);
        }
    }

    private static boolean processCheck() {
        if (names == null) {
            System.out.println("아직 학생정보가 없습니다. 입력후 사용가능");
            return false;
        }
        return true;
    }

    private static void f_input() {
        System.out.print("학생수를 입력하세요.: ");
        int cnt = sc.nextInt();
        names = new String[cnt];
        scores = new int[cnt];
        grades = new Grade[cnt];

        for (int i = 0; i < cnt; i++) {
            System.out.printf("%d번째 학생 이름, 점수> ", i + 1);
            String data = sc.next();
            String[] arr = data.split(",");
            names[i] = arr[0];
            scores[i] = Integer.parseInt(arr[1]);
            grades[i] = makeGrade(scores[i]);
        }
    }

    private static Grade makeGrade(int score) {
        Grade result = null;
        switch (score / 10) {
            case 9, 10 -> {
                result = Grade.A;
            }
            case 8 -> {
                result = Grade.B;
            }
            case 7 -> {
                result = Grade.C;
            }
            case 6 -> {
                result = Grade.D;
            }
            default -> {
                result = Grade.F;
            }
        }
        return result;
    }

    private static void menuDisplay() {
        System.out.println("-----------------------------------------------------");
        System.out.println("1.학생수(이름,점수입력)  2.성적목록  3.최고 점수를 받은 학생 찾기");
        System.out.println("4.평균 점수          5.특정 점수 이상 학생            6.종료");
        System.out.println("-----------------------------------------------------");
        System.out.println("선택> ");
    }
}