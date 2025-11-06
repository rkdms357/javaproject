package com.shinhan.day11;

class Parent {
}

public class UppercaseThread extends Parent implements Runnable {
    @Override
    public void run() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}