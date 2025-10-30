package com.shinhan.day06;

import com.shinhan.day05.lab5.Employee;

class Date {
}

public class Review {
    Employee emp;
    Date dt1; // 이건 내꺼 Date
    java.util.Date dt2;
    java.sql.Date dt3;
    //com.shinhan.day07.Date dt4; // 다른 패키지에 있는 거
    // 클래스의 구성멤버 1. field, constructor, method, 일반method, {}, static{}
    int i = 0;
    static int j = 1;
    static final int SUCCESS_SCORE = 100;
    static final int SUCCESS_SCORE2;
    final int SUCCESS_SCORE3 = 300;
    final int SUCCESS_SCORE4;
    final int SUCCESS_SCORE5;

    static {
        SUCCESS_SCORE2 = 200;
    }

    {
        i++;
        j++; // 이건 됨
        SUCCESS_SCORE4 = 400;
    }

    Review() {
        this(500);
    }

    static {
        j++;// i++; 이거안됨
    }

    Review(int data) {
        i += data;
        j++; // 이거 됨
        // System.out.println(s); f1의 지역변수라 안됨
        // model = "ABC";
        SUCCESS_SCORE5 = data;
    }

    void f1() {
        String s = "자바";
        System.out.println(s); // 이거 됨
    }

    String model;

    public static void main(String[] args) {
        Review aa = new Review(100);
        System.out.println(aa.model);
    }
}