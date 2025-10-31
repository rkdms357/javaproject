package com.shinhan.day07;

//public>protected>생략 : 같은 패키지는 접근 가능
class Machine {
    public int a = 1; // 인스턴스 변수
    private int a2 = 10;
    public static int b = 2; // 클래스 변수

    //같은 패키지면 접근 가능
    //다른 패키지면 상속받으면 접근 가능
    protected String password = "1234";

    Machine() {
        System.out.println("Machine 기본 생성자");
    }

    Machine(String a) {
        System.out.println("Machine 매개변수 있는 생성자");
    }

    public void f1() {
        System.out.println("Machine f1()메서드");
    }

    private void f2() { // 이 클래스안에서만 사용
        System.out.println("Machine f2()메서드");
    }

    public static void f3() {
        System.out.println("Machine f3()메서드");
    }
}

public class Review {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.a);
        //System.out.println(car.a2);
        System.out.println(Car.b);
        car.f1();
        //car.f2();
        Car.f3();

        System.out.println(car.password);
    }
}