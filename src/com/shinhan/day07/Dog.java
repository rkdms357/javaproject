package com.shinhan.day07;

//자식
public class Dog extends Animal {
    int a;

    public Dog(String name, String color, int a) {
        super(name, color);
        this.a = a;
    }

    void f1() {
        System.out.println("Dog가 추가한 함수");
    }

    @Override
    void sing() {
        super.sing();
        System.out.println(getClass().getName());
        System.out.println("-------------------------");
    }
}