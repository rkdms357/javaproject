package com.shinhan.day08.q9;

interface Calculator {
    void 계산(int a, int b);
}

public class ActionExample {
    public static void main(String[] args) {
        //함수가 1개밖에 없어서 익명구현클래스를 더 쉽게!
        Calculator cal = (a, b) -> System.out.println("더한 값은 " + (a + b));
        cal.계산(1, 2);

        Calculator cal2 = (a, b) -> System.out.println("뺀 값은 " + (a - b));
        cal.계산(1, 2);
    }

    public static void main4() {
        //더 쉽게 표현
        Action action = () -> System.out.println("람다표현식");
        action.work();
    }

    public static void main3() {
        // 익명구현클래스
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("익명구현클래스");
            }
        };
        action.work();
        (new Action() {
            @Override
            public void work() {
                System.out.println("즉시실행!");
            }
        }).work();
    }
}