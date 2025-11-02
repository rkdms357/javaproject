package com.shinhan.day07.lab7;

public class Car extends Vehicle {

    int gasMileage;

    Car(String name, int speed, int gasMileage) {
        super(name, speed);
        this.gasMileage = gasMileage;
    }

    @Override
    void extraInfo() {
        System.out.println("연비: " + gasMileage + "km/L");
    }
}