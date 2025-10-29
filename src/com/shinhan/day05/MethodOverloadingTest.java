package com.shinhan.day05;

import java.util.Arrays;

//JAVA빈즈 기술을 사용할거임 : JSP/Servlet, Spring, Mybatis등에서 이 기술을 사용
//#{title} --> getTitle()
//${title} --> getTitle()
public class MethodOverloadingTest {
    private String title;
    private int price;

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    //void : return값이 없음을 의미
    void sum() {
        System.out.println("매개변수 x, return x");
        //return; 숨어있음~
        //System.out.println("*********************"); return하면 여기까지안옴
    }

    //오버로딩은 매개변수 사양이 달라야함!!! (개수, 타입)
    private void sum(int i, int j) {
        System.out.println("합계: " + (i + j));
    }

    private void sum(double i, double j, double k) {
        System.out.println("합계: " + (i + j + k));
    }

    private void sum(int... arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        MethodOverloadingTest a = new MethodOverloadingTest();
        a.sum();
        a.sum(10, 20);
        a.sum(10, 20, 30); //형변환 자동됨니다 하하
        a.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("=============Main End===============");
    }

}