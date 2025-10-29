package com.shinhan.day05;

import java.util.Scanner;

class KeyBoard extends Object {
    String model;
    String color;

    public KeyBoard(String model, String color) {
        super();
        this.model = model;
        this.color = color;
    }

    void method() {
        String s = getClass().getSimpleName();
    }

    //오버라이드(덮어쓰기) : 함수이름같고 매개변수 개수, 타입 같고 return타입 같고 접근지정자는 같거나 더 넓어져야함
    @Override
    public String toString() {
        return "model: " + model + "color: " + color;
    }

    public static void main3(String[] args) {
        KeyBoard keyBoard1 = new KeyBoard("ABC", "black");
        System.out.println(keyBoard1);
        System.out.println(keyBoard1.toString());
    }
}

class Pencil {
    @Override
    public String toString() {
        return "Pencil #########################";
    }
}

public class ToStringTest {

    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj);
        System.out.println(obj.toString());

        String str = new String("이것이 자바다");
        System.out.println(str);
        System.out.println(str.toString());

        Pencil p1 = new Pencil();
        System.out.println(p1);
        System.out.println(p1.toString());
    }

    public static void main2(String[] args) {
        String str1 = "이것이 자바당";
        System.out.println(str1);
        System.out.println(str1.toString());

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println(sc.toString());
    }
}