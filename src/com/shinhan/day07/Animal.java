package com.shinhan.day07;

//부모
public class Animal {

    String name;
    String color;

    public Animal(String name, String color) {
        super();
        this.name = name;
        this.color = color;
    }

    void sing() {
        System.out.println("동물은 소리를 냅니다.");
    }
}