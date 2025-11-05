package com.shinhan.day10;

//어노테이션 사용
public class PrintService {
    @PrintAnnotation
    public void method1() {
        System.out.println("method1실행");
    }

    @PrintAnnotation(value = "*", number = 10, number2 = 20)
    public void method2() {
        System.out.println("method2실행");
    }

    @PrintAnnotation(value = "@", number = 5)
    public void method3() {
        System.out.println("method3실행");
    }
}