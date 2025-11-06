package com.shinhan.day11;

import java.util.ArrayList;

import com.shinhan.day10.Car;

public class GenericTest {
    public static void main(String[] args) {
        f6();
    }

    private static void f6() {
        BoxManagement2 obj = new BoxManagement2();
        Box<String, String> box = obj.makeBox("AA", "BB");
        System.out.println(box);
    }

    private static void f5() {
        BoxManagement<String, Integer> obj = new BoxManagement<>();
        Box<String, Integer> box;
        box = obj.makeBox("자바책", 300);
    }

    private static void f4() {
        Box<String, Integer> obj, obj2;
        obj = new Box<>("커피", 100);
        obj2 = obj.makeBox("computer", 200);
        System.out.println(obj);
        System.out.println(obj2);
    }

    private static void f3() {
        //List : 순서있고 중복허용
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("월요일");
        alist.add("월요일");
        alist.add("화요일");
        alist.add("월요일");
        for (String s : alist) {
            System.out.println(s.length());
        }
    }

    private static void f2() {
        Car car1 = new Car("ABC", 1000, "white");
        Box<Car, String> box1;
        box1 = new Box<Car, String>(car1, "large");
        System.out.println(box1);
    }

    private static void f1() {

        //Box box1 = new Box("커피", 100); //어떤타입으로 들어가는지 지정안해서 Object로 들어감
        //String s = (String)box1.getKind();
        //int size = (Integer)box1.getSize();

        Box<String, Integer> box1 = new Box<>("커피", 100);
        System.out.println(box1);
        System.out.println(box1.getKind());
    }
}