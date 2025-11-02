package com.shinhan.day07.lab7;

public class Truck extends Vehicle {
    int maxLoad;

    Truck(String name, int speed, int maxLoad) {
        super(name, speed);
        this.maxLoad = maxLoad;
    }

    @Override
    void extraInfo() {
        System.out.println("최대 적재량: " + maxLoad);
    }
}