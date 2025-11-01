package com.shinhan.day07.inter;

public class ImplementA extends Object implements MyInterface {
    @Override
    public void method1() {
        System.out.println(getClass().getSimpleName() + "method1구현함");
    }

    @Override
    public void method2() {
        System.out.println(getClass().getSimpleName() + "method2구현함");
    }
}