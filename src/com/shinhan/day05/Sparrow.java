package com.shinhan.day05;

public class Sparrow {

    String name;
    int legs;
    int length;

    public Sparrow(String name, int legs, int length) {
        this.name = name;
        this.legs = legs;
        this.length = length;
    }

    public void fly() {
        System.out.println("참새(" + name + ")가 " + "날아다닙니다.");
    }

    public void sing() {
        System.out.println("참새(" + name + ")가 소리 내어 웁니다");
    }

    @Override
    public String toString() {
        return "참새의 이름은 "
                + name
                + "입니다. 다리는 "
                + legs
                + "개이고 길이는 "
                + length
                + "입니다.";
    }
}