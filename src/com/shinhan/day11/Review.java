package com.shinhan.day11;

import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Review {
    public static void main(String[] args) {
        f2();
    }

    private static void f2() {
        //클래스 기준으로 자원의 상대경로를 주고 절대경로를 알아냄
        URL url = Review.class.getResource("../day10/application.txt"); //Review 클래스 기준
        //URL url = Car.class.getResource("application.txt"); //Car 클래스 기준
        System.out.println(url.getPath()); //파일의 경로를 읽기
    }

    private static void f1() {
        //이름이 한글이어야함
        String regExp = "[가-힣]+";
        String data = "홍길동";
        String data2 = "홍길동 aaaaaaaaaaaaa 김길동 bbbbbbbb 박길동";
        boolean result = Pattern.matches(regExp, data);
        System.out.println(result ? "정상입력" : "입력오류");

        //이름만 뽑아냄
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(data2);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}