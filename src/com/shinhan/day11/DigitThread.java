package com.shinhan.day11;

//1. Thread 클래스 상속받음
//2. Thread로 실행되려면 run()메서드를 구현해야함
public class DigitThread extends Thread {
    DigitThread(String myName) {
        super(myName);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.println(getName() + ":" + i);
            try {
                sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}