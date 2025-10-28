package com.shinhan.day04;

public class CoffeeTest {
    public static void main(String[] args) {
        f1();
        f2();
    }

    private static void f2() {
        Coffee c1 = new Coffee("카페라떼", 4000, true);
        Coffee c2 = new Coffee("아메리카노", 3000, true);
        System.out.println(c1.cnt); //권장안함
        System.out.println(Coffee.cnt);
        Coffee.printCnt();
        c1.printCnt(); //권장안함

        c1.print();
        c2.print();
    }

    private static void f1() {
        Coffee c1 = new Coffee("카페라떼", 4000);
        c1.print();
    }
}