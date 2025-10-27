package com.shinhan.day03;

public class ObjectTest2 {
    public static void main(String[] args) {
        int i; //i변수에 int를 담을 수 있음
        Car c1; //c1변수에 Car를 담을 수 있음
        i = 100;
        c1 = new Car();
        System.out.println(i);
        System.out.println(c1);
        System.out.println(System.identityHashCode(c1));
        c1.model = "A모델"; //new String("A모델")
        System.out.println(c1.model);
    }
}