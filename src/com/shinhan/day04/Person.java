package com.shinhan.day04;

public class Person {

    //1.필드 (멤버변수, 클래스변수..static)
    String name;

    //2.생성자
    //매개변수 이름과 필드 이름이 충돌
    //이 class를 이용해서 만든 객체 자신 = this!!!!!!
    Person(String name) {
        this.name = name;
    }

    //2.메서드
    void 먹는다() {
        System.out.println(name + "(이)가 먹는다.");
    }

    void 웃다() {
        System.out.println(name + "(이)가 웃는다.");
    }

    void 계산한다(int n1, int n2) {
        System.out.println(name + "(이)가 계산한다.");

        Calculator cal = new Calculator();
        int result1 = cal.plus(n1, n2);
        int result2 = cal.minus(n1, n2);

        System.out.println("더하기: " + result1);
        System.out.println("빼기: " + result2);
    }
}