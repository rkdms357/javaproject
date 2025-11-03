package com.shinhan.day08.q9;

interface Vehicle {
    public void run();
}

//1. 구현클래스를 만든다.
class VehicleImpl implements Vehicle {
    @Override
    public void run() {
        System.out.println("1.구현클래스를 만든다.");
    }
}

//2.익명구현클래스를 만든다
class Anonymous {
    //1)field의 초기값으로 사용
    Vehicle field = new Vehicle() {
        public void run() {
            System.out.println("2.익명구현클래스를 만든다. 1)field의 초기값으로 사용하기");
        }
    };

    void method1() {
        //2)지역변수의 초기값으로 사용하기
        Vehicle localVar = new Vehicle() {
            public void run() {
                System.out.println("2.익명구현클래스를 만든다. 2)지역변수의 초기값으로 사용하기");
            }
        };
        field.run();
        localVar.run();
    }

    void method2(Vehicle arg) {
        arg.run();
    }
}

public class AnonymousExample {
    public static void main(String[] args) {
        f();
    }

    private static void f() {
        Anonymous annony = new Anonymous();
        annony.field.run();
        annony.method1();
        annony.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("3.익명구현클래스가 만들어져서 파라메터로 전달됨");
            }
        });
        annony.method2(() -> System.out.println("4.익명구현클래스가 만들어져서 파라메터로 전달됨(람다표현식)"));
    }
}