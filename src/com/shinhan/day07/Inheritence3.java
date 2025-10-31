package com.shinhan.day07;

sealed class Person2 permits Employee, Manager {

}

final class Employee extends Person2 {
}

non-sealed class Manager extends Person2 {
}

public class Inheritence3 {
    public static void main(String[] args) {
        f1();
    }

    private static void f1() {
        //abstract class는 인스턴스 생성 불가
        //final class는 상속이 불가능 new Number();

        //Integer a = new Integer(100);
        Integer b = 100;

    }
}