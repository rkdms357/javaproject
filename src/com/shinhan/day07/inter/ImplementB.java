package com.shinhan.day07.inter;

public class ImplementB extends Object implements MyInterface {
    void call() {
        System.out.println("ImplementB에서 추가한 method");
    }

    @Override
    public void method3() {
        MyInterface.super.method3();
        System.out.println("-----default 함수 : ImplementB에서 method3()를 구현클래스가 재정의함-----");
    }

    @Override
    public void method1() {
        System.out.println(getClass().getSimpleName() + "method1구현함");
    }

    @Override
    public void method2() {
        System.out.println(getClass().getSimpleName() + "method2구현함");
    }
}