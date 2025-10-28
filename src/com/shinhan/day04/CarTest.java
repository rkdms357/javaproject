package com.shinhan.day04;

public class CarTest {
    public static void main(String[] args) {
        f1();
    }

    private static void f1() {
        //1. 객체 참조변수를 선언: class가 타입, 변수는 Object
        //2. 객체 생성: heap메모리에 만들어진다. Object = instance
        //3. 객체 사용
        Car c1, c2;
        c1 = new Car(); //필드는 자동초기화
        c2 = new Car();

        System.out.println(c1.model + ":" + c1.price);
        System.out.println(c2.model + ":" + c2.price);

        c1.model = "BMW520";
        c1.price = 7000;
        c1.company = "기아";

        System.out.println(c1.model + ":" + c1.price + ":" + c1.company);
        System.out.println(c2.model + ":" + c2.price + ":" + c2.company);
        System.out.println(Car.company);

        c1.method1();
        c1.method2();
    }
}