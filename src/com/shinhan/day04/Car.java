package com.shinhan.day04;

//class : Object를 만드는 툴, 설계도, 필드(속성, 데이터저장) + 메서드(기능, 동작, 함수)
//Object : class를 이용해서 만든 실체(instance)
//public : 모든 패키지에서 접근 가능
public class Car {

    //1. field
    String model;
    int price;

    //2. constructor method (생성자)...초기화 목적. 클래스명과 같아야함
    Car() {
        System.out.println("Car constructor...Object생성시마다 실행");
    }

    //3. 일반 method ...함수이름과 return 타입이 필수!
    void method1() {
        System.out.println("일반 method1...");
    }

    void method2() {
        System.out.println("일반 method2...");
    }

    //4. instance block
    {
        System.out.println("instance block...Object생성시마다 실행");
    }

    //5. static block
    static {
        System.out.println("static block...class load시 1번 실행");
    }
}