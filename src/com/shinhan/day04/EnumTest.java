package com.shinhan.day04;

import java.util.Calendar;

public class EnumTest {
    //상수 : 수정불가한 값
    static final int SUCCESS_SCORE = 90; //final 붙이고 대문자
    static final int PASSWORD = 1234;

    public static void main(String[] args) {
        f1();
        f2();
        f3();
        f4();
    }

    private static void f4() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //화요일

        int weekSeq = cal.get(Calendar.DAY_OF_WEEK);
        Week today = null;
        switch (weekSeq) {
            case 1 -> today = Week.SUNDAY;
            case 2 -> today = Week.MONDAY;
            case 3 -> today = Week.TUESDAY;
            case 4 -> today = Week.WEDNESDAY;
            case 5 -> today = Week.THURSDAY;
            case 6 -> today = Week.FRIDAY;
            case 7 -> today = Week.SATURDAY;
        }
        System.out.println("오늘은" + today);
        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("자바를 공부합니다.");
        }
    }

    private static void f3() {
        Week[] arr = Week.values();
        for (Week data : arr) {
            System.out.println(data.ordinal() + ":" + data.name() + ":" + data.toString());
        }
    }

    private static void f2() {
        EnumScore a = call(95);
        if (a == EnumScore.SUCCESS_SCORE) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }

    private static EnumScore call(int score) {
        if (score >= 90) {
            return EnumScore.SUCCESS_SCORE;
        } else {
            return EnumScore.FAIL_SCORE;
        }
    }

    private static void f1() {
        //enum전에는 상수를 사용함
        int score = 99;
        if (score >= SUCCESS_SCORE) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }
}