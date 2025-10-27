package com.shinhan.day03;

import java.util.Arrays;
import java.util.Scanner;

//class : Object를 만드는 툴, 변수(데이터저장)+함수(기능)
//Object : class를 이용해서 만든 실체(인스턴스), heap메모리에 생성됨
//변수는 stack에 저장됨
//기본형은 값을 저장
//참조형은 주소를 저장 (객체가 생성된 메모리 번지를 저장. 객체를 가리키게됨)
//JVM은 운영체제에서 할당 받은 메모리 영역을 메소드영역, 힙영역, 스택 영역으로 구분해서 사용
//메소드 영역 : 바이트코드 파일을 읽은 내용이 저장됨
//힙 영역 : 객체가 생성되는 영역. 객체의 번지는 메소드 영역과 스택 영역의 상수와 변수에서 참조
//스택 영역 : 메서드를 호출할때마다 생성되는 프레임이 저장되는 영역
//Thread : 프로그램의 흐름, single Thread, multi Thread
class Car {
    String model;
    void go() {
        System.out.println("차가 움직입니다." + model);
    }
}

public class ObjectTest {
    public static void main(String[] args) {
        //f1();
        //f2();
        f3();
        f4();
        f5();
        f6();
    }

    private static void f6() {
        String str = "햄버거 김밥,포케:커피";
        String[] arr = str.split(",|:| "); //|는 OR
        System.out.println(Arrays.toString(arr));
    }

    //index는 0부터 시작
    private static void f5() {
        String str = "이것이 자바다.";
        System.out.println(str.length());
        System.out.println(str.charAt(4)); //자
        System.out.println(str.substring(4, 6)); //자바

        System.out.println(str.replace("자바", "JAVA")); //바뀌게 보이지만
        System.out.println(str); //안바뀜. 문자열은 고정값이기때문

        //String은 고정문자열이기때문에 replace()로 변경불가. 재할당해서 사용했다면 주소가 바뀜
        str = str.replace("자바", "JAVA");
        System.out.println(str);

        System.out.println(str.indexOf("JAVA")); //4. 특정 문자열의 위치찾기.
    }

    private static void f4() {
        String s1 = null; //참조된 주소가 없음
        //int i = null; //기본형은 null을 사용불가
        Integer i = null; //가능
        System.out.println(s1); //null
        //System.out.println(s1.length()); //NullPointerException오류
    }

    private static void f3() {
        String s1 = "자바"; //컴파일시에 결정
        String s2 = "자바"; //String s1 = new String("자바"); 와 같음. 같은 리터럴은 재사용.
        String s3 = new String("자바"); //실행시에 생성됨
        String s4 = new String("자바"); //실행시에 생성됨

        //String : 고정 문자열임
        s1 += "프로그램"; //새로운 주소에 만들어짐
        s2 += "프로그램";

        System.out.println(s1 == s2); //주소비교 : 처음에는 true, 값 변경되면 주소달라져서 false로
        System.out.println(s3 == s4); //주소비교 : false

        System.out.println(s1.equals(s4)); //기능을 이용해서 값 비교해야 함
    }

    private static void f2() {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.model = "A모델";
        c2.model = "B모델";
        System.out.println(c1); //com.shinhan.day03.Car@2f92e0f4 -> hex값. 주소임.
        System.out.println(c2); //com.shinhan.day03.Car@28a418fc
    }

    private static void f1() {
        int score = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println(score);
        System.out.println(sc);
        //toString()정의 되어있으면 문자열출력, 아니면 hashCode의 hex값 출력
    }
}