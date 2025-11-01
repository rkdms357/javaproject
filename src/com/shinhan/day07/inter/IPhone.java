package com.shinhan.day07.inter;

public class IPhone implements CellPhone {
    @Override
    public void powerOn() {
        System.out.println(getClass().getSimpleName() + "powerOn");
        System.out.println("*****iphone*****");
    }

    @Override
    public void powerOff() {
        System.out.println(getClass().getSimpleName() + "powerOff");
        System.out.println("*****iphone*****");
    }
}