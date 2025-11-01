package com.shinhan.day07.inter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class InterfaceTest {
    public static void main(String[] args) {
        //f3();
        //f4();
        //f5();
        f6();
    }

    private static void f6() {
        //여러개의 값을 저장하고자함
        //개수가 확정되어있고 변경안됨 : Array
        //개수가 변경가능 : Collection : List(순서, 중복 가능), Set, Map
        //List interface -> 구현클래스 : 연속공간에 넣을때 ArrayList, LinkedList, Vector...

        List<String> aList = new ArrayList<>();
        aList.add("문자1");
        aList.add("문자2");
        aList.add("문자3");
        aList.add("문자2");
        for (String s : aList) {
            System.out.println(s);
        }
    }

    private static void f5() {
        CellPhone phone = new IPhone();
        phone.powerOn();
        phone.powerOff();
    }

    private static void f4() {
        JDBC db = new OracleDB();
        db.connection();
        db.statement();
        db.execute();
    }

    private static void f3() {
        MyInterface var1 = new ImplementB();
        var1.method1();
        var1.method2();
        var1.method3();
        if (var1 instanceof ImplementB aa) {
            aa.call();
        }
        MyInterface.method4();
        System.out.println(var1.MAX_VAULE); // 권장안함
        System.out.println(MyInterface.MAX_VAULE);
        System.out.println(MyInterface.MAX_VAULE2);
    }

    private static void f2() {
        ImplementB var1 = new ImplementB();
        var1.method1();
        var1.method2();
        var1.method3();
        MyInterface.method4();
        System.out.println(var1.MAX_VAULE); // 권장안함
        System.out.println(MyInterface.MAX_VAULE);
        System.out.println(MyInterface.MAX_VAULE2);
    }

    private static void f1() {
        ImplementA var1 = new ImplementA();
        var1.method1();
        var1.method2();
        var1.method3();
        MyInterface.method4();
        System.out.println(var1.MAX_VAULE); // 권장안함
        System.out.println(MyInterface.MAX_VAULE);
        System.out.println(MyInterface.MAX_VAULE2);
    }
}