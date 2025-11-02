package com.shinhan.day07.lab7;

public class Bus extends Vehicle {
    int passengerCount;

    Bus(String name, int speed, int passengerCount) {
        super(name, speed);
        this.passengerCount = passengerCount;
    }

    @Override
    void extraInfo() {
        System.out.println("승객 수용 가능 인원: " + passengerCount);
    }
}