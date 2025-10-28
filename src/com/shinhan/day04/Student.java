package com.shinhan.day04;

import java.util.Arrays;

public class Student {
    //1.필드
    String stdName;
    String stdNo;
    int[] score;

    //class변수, object들이 공유, c언어의 share
    static int cnt;

    //2.constructor method : 정의하지 않으면 컴파일시에 기본생성자를 만들어줌
    Student() {
        this(null, null, null);
    }

    //생성자의 오버로딩 : 이름같고 매개변수 타입이 다르다
    //매개변수 이름과 필드 이름이 충돌발생, 지역에서는 매개변수가 유효
    //이 class를 이용해서 만든 객체를 대신해서 this~
    //생성자는 필드 초기화가 목적
    //하나의 생성자에서 매개변수가 다른 해당 class 생성자를 호출
    //this()
    //
    Student(String stdName, String stdNo, int[] score) {
        this.stdName = stdName;
        this.stdNo = stdNo;
        this.score = score;
        cnt++;
    }

    Student(String stdName) {
        this(stdName, null, null);
    }

    Student(String stdName, String stdNo) {
        this(stdName, stdNo, null);
    }

    //3.method
    void print() {
        System.out.println("------------");
        System.out.println(stdName); //this생략됨
        System.out.println(stdNo);
        System.out.println(Arrays.toString(score));
    }
    //4.instance block
    //5.static block
}