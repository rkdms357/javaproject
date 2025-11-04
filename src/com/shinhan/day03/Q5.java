package com.shinhan.day03;

import java.util.Arrays;
import java.util.Scanner;

/*
1. 참조 타입에는 배열, 열거, 클래스, 인터페이스가 있다
2. 참조 타입 변수의 메모리 생성 위치는 스택이다
3. 참조 타입에서 ==, != 연산자는 객체 번지를 비교한다
4. 참조 타입은 null값으로 초기화 할 수 없다 → x
참조 타입은 null 값으로 초기화 가능

1. 로컬 변수는 스택 영역에 생성되며 실행 블록이 끝나면 소멸된다
2. 메소드 코드나 상수, 열거 상수는 정적 메소드 영역에 생성된다
3. 참조되지 않는 객체는 프로그램에서 직접 소멸 코드를 작성하는 것이 좋다 → x
Java는 가비지 컬렉터(GC)가 자동으로 메모리를 해제하므로
직접 소멸 코드를 작성하지 x
4. 배열 및 객체는 힙 영역에 생성된다

1. String은 클래스이므로 참조타입이다
2. String 타입의 문자열 비교는 ==를 사용해야 한다 → x
문자열 내용 비교는 equals()를 사용해야 함
3. 동일한 문자열 리터럴을 저장하는 변수는 동일한 String 객체를 참조한다
4. new String("문자열")은 문자열이 동일하더라도 다른 String 객체를 생성한다

1. int[] array = {1, 2, 3}
2. int[] array; array = {1, 2, 3} → x
-> array = new int[]{1, 2, 3};
3. int[] array = new int[3];
4. int[][] array = new int[3][2];

1. 정수 타입 배열 항목의 기본 초기값은 0이다
2. 실수 타입 배열 항목의 기본 초기값은 0.0f 또는 0.0이다
3. boolean 타입 배열 항목의 초기값은 true이다 → x
기본값은 false
4. 참조 타입 배열 항목의 기본 초기값은 null이다
 */
public class Q5 {

    public static void main(String[] args) {
        f1();
        f2(2, 3);
        f3();
        f6();
        f7();
        f8();
        //f9();
    }

    private static void f9() {
        boolean isStop = false;
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[] score = null;
        while(!isStop) {
            menuDisplay();
            int selectJob = sc.nextInt();
            switch(selectJob) {
                case 1 -> {
                    System.out.print("학생수> ");
                    cnt = sc.nextInt();
                }
                case 2 -> {
                    score = new int[cnt];
                    for(int i = 0; i < cnt; i++) {
                        System.out.printf("score[%d]> ", i);
                        score[i] = sc.nextInt();
                    }
                }
                case 3 -> {
                    for(int i = 0; i < cnt; i++) {
                        System.out.printf("score[%d]> %d", i, score[i]);
                    }
                }
                case 4 -> {
                    if(cnt == 0 || score == null) {
                        System.out.println("학생수와 점수가 없습니다.");
                        break;
                    }
                    int maxScore = Integer.MIN_VALUE;
                    int total = 0;
                    for(int data:score) {
                        total += data;
                        if(maxScore < data) {
                            maxScore = data;
                        }
                    }
                    System.out.printf("최고 점수: %d", maxScore);
                    System.out.printf("평균 점수: %3.1f\n", (double)total/cnt);
                }
                case 5 -> {isStop = true;}
                default -> {System.out.println("제공되지 않는 작업입니다. 다시 선택하세요.");}
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
        int total = 0;
        int avg = 0;
        for(int row = 0; row < array.length; row++) {
            for(int col = 0; col < array[row].length; col++) {
                total += array[row][col];
            }
        } avg = total / array.length;
        System.out.printf("전체 합은 %d이고 평균은 %d", total, avg);
    }

    private static void f7() {
        int[] array = {1, 5, 3, 8, 2};
        for(int i = 1; i < array.length; i++) {
            int tmp = 0;
            if (array[i-1] > array[i]) {
                tmp = array[i];
                array[i] = array[i-1];
                array[i-1] = tmp;
            }
        }
        System.out.println(array[array.length-1]);
    }

    private static void f6() {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        System.out.println(array.length); //3
        System.out.println(array[2].length); //5
    }

    private static void f3() {
        int[] array = { 1, 2, 3 }; // new int[]{1, 2, 3};도 가능
        int[] array2;
        array2 = new int[] { 1, 2, 3 };
        int[] array3 = new int[3]; // 자동초기화
        int[][] array4 = new int[3][2]; // 3개짜리 배열을 참조함. 그 각각은 아직 배열생성안함
        array4[0] = new int[10]; // 이렇게 나중에 생성해도 됨
    }

    // 매개변수도 지역변수
    private static void f2 (int a, Integer b) {
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
