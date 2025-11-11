package com.shinhan.day13;

class MyThreadA extends Thread {
    public void run() {
        System.out.println("ThreadA: Thread 상속 클래스임");
    }
}

class Parent {}

class MyRunnable extends Parent implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable: Runnable 인터페이스를 구현한 구현클래스임");
    }
}

//람다표현식이 되는지 점검
@FunctionalInterface
interface MyCalculator {
    void add(int a, int b);
    //void add2(int a, int b); //추상메서드가 1개있어야함
}

//소비자 (Consumer) : (arg)->{ 실행문; }
//공급자 (Supplier) : ()->{ return 값; }
//Function         : (arg)->{ return 값; }
@FunctionalInterface
interface MyInterface {
    //void sum();
    //void sum(int a); //소비자
    //String sum(); //공급자
    String sum(int a, int b); //소비+공급
}

public class LambdaTest {
    public static void main(String[] args) {
        f4();
    }

    private static void f4() {
        //MyInterface my1 = ()->{System.out.println("매개변수 없음, return 없음");};
        //MyInterface my1 = (x)->{System.out.println(x + "매개변수 있음, return 없음(소비자)");};

        //MyInterface my1 = ()->{ return "매개변수 없음, return 있음(공급자)";};
        //String result = my1.sum();
        //System.out.println(result);

        MyInterface my1 = (x, y) -> "합계는 " + (x + y) + "입니다.";
        String result = my1.sum(10, 20);
        System.out.println(result);
    }

    private static void f3() {
        MyCalculator cal = new MyCalculator() {
            @Override
            public void add(int a, int b) {
                System.out.println("더하기: " + (a + b));
            }
        };
        MyCalculator cal2 = (a, b) -> System.out.println("빼기: " + (a - b));
        cal.add(1, 2);
        cal2.add(1, 2);
    }

    private static void f2() {
        //@FunctionalInterface은 추상메서드가 1개를 가지고있음
        //그럼 람다표현식으로도 가능함
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("익명구현클래스...Local Class");
            }
        };
        Runnable r2 = () -> {
            System.out.println("익명구현클래스...Local Class(람다표현식)");
        };
        call(r1);
        call(r2);
        System.out.println("-------main End-------");
    }

    private static void call(Runnable rr) {
        Thread t1 = new Thread(rr);
        t1.start();
    }

    private static void f1() {
        Thread t1 = new MyThreadA();
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName() + " End");
    }
}