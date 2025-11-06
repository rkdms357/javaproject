package com.shinhan.day11;

public class LowercaseThread implements Runnable {
    @Override
    public void run() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}