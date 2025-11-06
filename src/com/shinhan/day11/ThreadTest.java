package com.shinhan.day11;

//싱글쓰레드 : 프로그램 흐름이 1개
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "시작");
        //숫자 출력(1~26)
        DigitThread t1 = new DigitThread("숫자Thread");

        //대문자 출력
        UppercaseThread upper = new UppercaseThread();
        Thread t2 = new Thread(upper);

        //소문자 출력
        Thread t3 = new Thread(new LowercaseThread());

        //Thread실행..extends Thread, implements Runnable
        //run()메서드 구현, start()로 실행
        t1.start();
        t2.start();
        t3.start();

        //숫자 출력
        for (int i = 100; i <= 110; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "main 끝");
    }
}