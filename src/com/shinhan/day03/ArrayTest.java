package com.shinhan.day03;

import java.util.Arrays;

//배열 : 하나의 이름으로 같은 타입의 값을 여러개 저장하기 위해 만드는 연속공간
public class ArrayTest {
    //main(매개변수) : 프로그램 시작점, JVM이 자동으로 수행함
    //void : return없음. main수행후 JVM에 return 되는 값이 없음
    //public : 모든 패키지에서 접근 가능
    //static : class load시에 자동으로 method영역에 올림
    public static void main(String[] args) {
        f1();
        f2();
        f3();
        f4();
        f5();
        f6();
    }

    private static void f6() {
        String[] arr = new String[5];
        String[] arr2 = new String[]{"자바", "오라클", "웹"};
        System.out.println(Arrays.toString(arr)); //[null, null, null, null, null]
        System.out.println(Arrays.toString(arr2)); //[자바, 오라클, 웹]
    }

    private static void f5() {
        int[][] arr1 = new int[][]{{10, 20, 30}, {40, 50}, {60, 70, 80, 90}};
        System.out.println(arr1[0][0]); //10
        System.out.println(arr1[2][3]); //90
    }

    private static void f4() {
        //2차원 : 배열의 배열
        int[][] arr1;
        int[] arr2[];
        int arr3[][];

        arr1 = new int[3][];
        arr1[0] = new int[4];
        arr1[1] = new int[3];
        arr1[2] = new int[2];

        System.out.println(Arrays.toString(arr1[0]));
        System.out.println(Arrays.toString(arr1[1]));
        System.out.println(Arrays.toString(arr1[2]));
    }

    private static void f3() {
        int[] arr3 = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }

    private static void f2() {
        //선언 + 생성
        int[] arr1 = new int[10];
        System.out.println(Arrays.toString(arr1));

        //선언 + 생성 + 초기화 ... 주의(개수는 반드시 생략)
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr2));

        //선언 + 생성 + 초기화 ...new int[] 생략 가능
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr3));

        //선언
        int[] arr4;
        //생성 + 초기화...new int[] 생략 불가능
        arr4 = new int[]{10, 20, 30, 40, 50};
    }

    private static void f1() {
        //1. 배열 참조 변수 선언
        int[] arr1 = null; //이 방식을 추천
        double arr2[];
        boolean[] arr3;
        String[] arr4;
        //2. 배열 생성(반드시 배열의 개수 입력!!!)..자동 초기화됨
        arr1 = new int[10]; //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0] -> 자동 초기화됨
        arr2 = new double[10]; //[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
        arr3 = new boolean[10]; //[false, false, false, false, false, false, false, false, false, false]
        arr4 = new String[10]; //[null, null, null, null, null, null, null, null, null, null]
        //3. 배열 사용
        System.out.println(arr1[0]); //생성되지 않으면 NullPointerException
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}