package com.shinhan.day14.q16;

import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            IntStream.rangeClosed(1, 3).forEach(i -> {
                System.out.println(i + "작업 스레드가 실행됩니다.");
            });
        });
        t1.start();
    }
}