package com.shinhan.day07;

//자식
public class Cat extends Animal {
    boolean b = true;

    public Cat(String name, String color) {
        super(name, color);
    }

    void method() {
        System.out.println("Cat이 추가한 함수");
    }

    @Override
    void sing() {
        super.sing();
        System.out.println(getClass().getName());
        System.out.println("*************************");
    }
}