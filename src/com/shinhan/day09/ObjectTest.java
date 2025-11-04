package com.shinhan.day09;

import java.util.HashSet;
import java.util.Set;

public class ObjectTest {
    public static void main(String[] args) {
        //f1();
        //f2();
        //f3();
        //f4();
        f5();
    }

    private static void f5() {
        //Collection : List(순서있고 중복있음), Set, Map
        //Set: 순서없음, 중복불가
        Set<Car> datas = new HashSet<>();
        datas.add(new Car("A", 100, "white"));
        datas.add(new Car("A", 100, "white"));
        datas.add(new Car("A", 200, "white"));
        datas.add(new Car("B", 100, "white"));
        System.out.println(datas.size());
    }

    private static void f4() {
        Car c1 = new Car("A", 2000, "white");
        Car c2 = new Car("A", 2000, "black");
        String s = new String("내차");
        System.out.println(c1);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(s));
    }

    private static void f3() {
        //Car는 Object를 상속받음
        //재정의x : toString(), equals(), hashCode()
        Car obj1 = new Car("A", 1000, "black");
        Car obj2 = new Car("A", 1000, "black");

        System.out.println(obj1);
        System.out.println(obj1.toString()); //주소 출력됨
        System.out.println(obj2);
        System.out.println(obj2.toString()); //주소 출력됨

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1 == obj2); //주소 비교
        System.out.println(obj1.equals(obj2)); //주소 비교
    }

    private static void f2() {
        //String는 Object를 상속받음
        //재정의 : toString(), equals(), hashCode()
        String obj1 = new String("신한금융");
        String obj2 = new String("신한금융");

        System.out.println(obj1);
        System.out.println(obj1.toString()); //내용 출력됨
        System.out.println(obj2);
        System.out.println(obj2.toString()); //내용 출력됨

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1 == obj2); //주소 비교
        System.out.println(obj1.equals(obj2)); //내용을 비교
    }

    private static void f1() {
        //Object : 모든 클래스의 부모 클래스
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1);
        System.out.println(obj1.toString()); //주소 출력됨, hashCode의 hex가 출력
        System.out.println(obj2);
        System.out.println(obj2.toString());

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2)); //주소비교
    }
}