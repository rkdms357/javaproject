package com.shinhan.day05;

public class Duck {
    String name;
    int legs;
    int length;

    public Duck(String name, int legs, int length) {
        this.name = name;
        this.legs = legs;
        this.length = length;
    }

    public void fly() {
        System.out.println("오리(" + name + ")는 " + "날지 않습니다.");
    }

    public void sing() {
        System.out.println("오리(" + name + ")가 소리 내어 웁니다");
    }

    @Override
    public String toString() {
        return "오리의 이름은 "
                + name
                + " 입니다. 다리는 "
                + legs
                + "개이고 길이는 "
                + length
                + "입니다.";
    }

}