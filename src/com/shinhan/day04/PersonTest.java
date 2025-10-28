package com.shinhan.day04;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("김길동");
        Person p2 = new Person("홍길동");

        p1.계산한다(10, 20);
        p2.계산한다(100, 200);
    }
}