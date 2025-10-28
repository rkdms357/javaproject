package com.shinhan.day04;

public class CarTest2 {
    public static void main(String[] args) {
        System.out.println(Car.company);

        Car c1 = new Car();
        c1.model = "AA";
        System.out.println(c1.model);
        c1.method1();
    }
}