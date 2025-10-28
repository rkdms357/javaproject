package com.shinhan.day04;

import java.util.Scanner;

public class Review {

    public static void main(String[] args) {
        f1();
        f3();
        f7();
        f8();
        f9();
    }

    private static void f9() {
        boolean isStop = false;
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[] score = null;
        while (!isStop) {
            menuDisplay();
            int selectJob = sc.nextInt();
            switch (selectJob) {
                case 1 -> {
                    System.out.print("학생수> ");
                    cnt = sc.nextInt();
                }
                case 2 -> {
                    score = new int[cnt];
                    for (int i = 0; i < cnt; i++) {
                        System.out.printf("score[%d]> ", i);
                        score[i] = sc.nextInt();
                    }
                }
                case 3 -> {
                    for (int i = 0; i < cnt; i++) {
                        System.out.printf("score[%d]> %d", i, score[i]);
                    }
                }
                case 4 -> {
                    if (cnt == 0 || score == null) {
                        System.out.println("학생수와 점수가 없습니다.");
                        break;
                    }
                    int maxScore = Integer.MIN_VALUE;
                    int total = 0;
                    for (int data : score) {
                        total += data;
                        if (maxScore < data) {
                            maxScore = data;
                        }
                    }
                    System.out.printf("최고 점수: %d", maxScore);
                    System.out.printf("평균 점수: %3.1f\n", (double) total / cnt);
                }
                case 5 -> {
                    isStop = true;
                }
                default -> {
                    System.out.println("제공되지 않는 작업입니다. 다시 선택하세요.");
                }
            }
        }
        sc.close();
        System.out.println("프로그램 종료");
    }

    private static void menuDisplay() {
        System.out.println("--------------------------------------------------");
        System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
        System.out.println("--------------------------------------------------");
        System.out.print("선택> ");
    }

    private static void f8() {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int totalSum = 0;
        int totalCnt = 0;
        for (int[] arrOne : array) {
            int total = 0;
            for (int data : arrOne) {
                total += data;
            }
            totalSum += total;
            totalCnt += arrOne.length;
        }
        System.out.println("전체총점:" + totalSum);
        System.out.println("전체평균:" + (double) totalSum / totalCnt);
    }

    private static void f7() {
        int[] array = {1, 5, 3, 8, 2};
        int max = Integer.MIN_VALUE;
        for (int data : array) {
            if (data > max) {
                max = data;
            }
        }
        System.out.println(max);
    }

    private static void f3() {
        int[] array = {1, 2, 3}; // new int[]{1, 2, 3};도 가능
        int[] array2;
        array2 = new int[]{1, 2, 3};
        int[] array3 = new int[3]; // 자동초기화
        int[][] array4 = new int[3][2]; // 3개짜리 배열을 참조함. 그 각각은 아직 배열생성안함
        array4[0] = new int[10]; // 이렇게 나중에 생성해도 됨
    }

    // 매개변수도 지역변수
    private static void f2(int a, Integer b) {
        System.out.println(a + b);
    }

    private static void f1() {
        // 기본형
        int a = 100;
        // 참조형
        Integer b = 200; // 참조타입은 null값으로 초기화 가능
        System.out.println(b);
        f2(a, b);

        b = null; // 더이상 참조하지 않음. dangling된 객체는 가비지컬렉터가 메모리에 자동제거됨
        System.gc(); // 당장 수행하는 것이 아니라 때가 되면 함. 자동보다 빨라질 수 있음. 권장 안함~

        String str1 = "자바";
        String str2 = "자바";
        String str3 = new String("자바");
//		str1 += "프로그램"; -> str2랑 주소가 달라짐
//		str2 += "프로그램";
//		str3 += "프로그램";
        System.out.println(str1 == str2); // 주소가 같다
        System.out.println(str2 == str3); // 주소가 다르다

        System.out.println(str1.equals(str2)); // 내용은 같음
        System.out.println(str1.equals(str3)); // 내용은 같음
    }
}