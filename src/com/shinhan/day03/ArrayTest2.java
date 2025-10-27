package com.shinhan.day03;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        // f1();
        int[] arr = {100, 99, 88};
        arr[0] = 200;
        System.out.println("before:" + Arrays.toString(arr));
        call(arr);
        System.out.println("after:" + Arrays.toString(arr));
        // 주소할당, 값 복사가 아님
        int[] arr2 = arr;
        // 복사
        int[] arr3 = new int[10];
        System.arraycopy(arr, 0, arr3, 0, arr.length);
        int[] arr4 = Arrays.copyOf(arr, arr.length);
        arr2[1] = 400;
        System.out.println("arr1:" + Arrays.toString(arr));
        System.out.println("arr2:" + Arrays.toString(arr2));
        System.out.println("arr3:" + Arrays.toString(arr3));
        System.out.println("arr3:" + Arrays.toString(arr4));
    }

    private static void call(int[] arr) {
        arr[0] = 300;
    }

    public static void f1() {
        // ...3명의 학생 점수, 각 학생마다 시험 과목의 수가 다름. 총점과 평균 출력
        // 1. 배열 참조 변수 선언
        int[][] arr;
        // 2. 배열 생성
        arr = new int[3][];
        arr[0] = new int[]{100, 90, 80};
        arr[1] = new int[]{90, 80};
        arr[2] = new int[]{90, 80, 70, 60};
        // 3. 배열 사용
        for (int row = 0; row < arr.length; row++) {
            System.out.printf("%d번째 학생의 총점, 평균", row + 1);
            int total = 0;
            for (int col = 0; col < arr[row].length; col++) {
                total += arr[row][col];
            }
            System.out.printf("%d...%3.1f \n", total, (double) total / arr[row].length);
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.printf("%d번째 학생의 총점, 평균", row + 1);
            int total = 0;
            // 향상for문
            // 외부반복자(iterator)
            for (int score : arr[row]) {
                total += score;
            }
            System.out.printf("%d...%3.1f \n", total, (double) total / arr[row].length);
        }
        // 2차원 반복문
        System.out.println("---------2차원for----------");
        int[][] arr3 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%d ", arr3[i][j]);
            }
            System.out.println();
        }
        // 2차원 향상for
        System.out.println("---------2차원(향상for)----------");
        for (int[] oneArray : arr3) {
            for (int data : oneArray) {
                System.out.printf("%d ", data);
            }
            System.out.println();
        }
        // 3차원 반복문
        int[][][] arr4 = {{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}}, {{11, 21, 31}, {41, 51}}};
        for (int[][] twoD : arr4) {
            for (int[] oneD : twoD) {
                for (int num : oneD) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println("-----");
        }
    }
}