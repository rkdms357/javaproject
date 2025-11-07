package com.shinhan.day12;
//Process : 실행중인 프로그램
//Thread : 프로세스안의 프로그램의 흐름, 싱글 스레드(하나있다면), 멀티스레드(여러개 있다면)
//만드는 방법
//1. Thread 클래스상속
//2. Runnable 인터페이스 구현 (다중상속이 불가해서)
//반드시 run()메서드 구현...start()로 스레드를 시작해야함 그래야 멀티스레드를 쓸수있음
class ThreadA extends Thread {
    public void run() {
        System.out.println("ThreadA...실행");
    }
}
class Parent {}
class RunnableImpl extends Parent implements Runnable{ //이미 부모가 있어서 스레드를 상속 못받음 -> Runnable인터페이스 구현해야함
    public void run() {
        System.out.println("ThreadB...실행");
    }
}
//일시적으로 재정의해서 사용하고 싶음. -> 익명으로 만듦
class MyClass {
    void method() {
        System.out.println("본래구현한 내용");
    }
}
public class Review {
    public static void main(String[] args) {
        //익명연습
        (new MyClass() {
            void method() {
                System.out.println("재정의한 내용");
            }
        }).method();

        //스레드로 익명으로 만들기
        (new Thread() {
            public void run() {
                System.out.println("Thread 익명 객체");
            }
        }).start();

        //Runnable 인터페이스를 이용해서 익명으로 만들기
        (new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 구현 익명 객체");
            }})).start();
    }

    public static void main2() {
        System.out.println(Thread.currentThread().getName() + "Thread 시작");
        f1(); //함수 수행되고 돌아올떄까지 기다림.

        ThreadA t1 = new ThreadA();
        Thread t2 = new ThreadA();
        Thread t3 = new Thread(new RunnableImpl()); //이렇게 스레드를 만들 수 있음

        t1.start(); t2.start(); t3.start();

        System.out.println(Thread.currentThread().getName() + "Thread 끝");
    }
    private static void f1() {
        System.out.println("함수 f1()");
    }
}