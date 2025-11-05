package com.shinhan.day09.q12;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100; //byte범위에 있으면 같은 주소 -128~127
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2);
        System.out.println(obj3 == obj4);

        System.out.println(obj1.equals(obj2));
        System.out.println(obj3.equals(obj4));
    }
}