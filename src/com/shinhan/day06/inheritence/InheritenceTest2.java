package com.shinhan.day06.inheritence;

class Parent {
    String name;
    private int money = 1000;

    Parent(int aa) {
        System.out.println("부모의 생성자");
    }

    public int getMoney() {
        return money - 100;
    }
}

class Child extends Parent {
    int name; //부모의 변수를 변경 가능
    String hair = "노란색"; //이건 내가 추가함

    Child() {
        // super(); 가 생략되어 있어서 먼저 호출
        super(111);
        System.out.println("자식의 생성자");
    }
}

public class InheritenceTest2 {
    public static void main(String[] args) {
        Child ch1 = new Child();
        System.out.println(ch1.getMoney());

        ch1.name = 12345;
        ch1.hair = "aaaaa";
    }
}