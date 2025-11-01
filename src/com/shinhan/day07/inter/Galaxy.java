package com.shinhan.day07.inter;

public class Galaxy implements CellPhone {
    @Override
    public void powerOn() {
        System.out.println(getClass().getSimpleName() + "powerOn");
    }

    @Override
    public void powerOff() {
        System.out.println(getClass().getSimpleName() + "powerOff");
    }
}