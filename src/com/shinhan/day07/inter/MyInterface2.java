package com.shinhan.day07.inter;

//public class MyInterface2 implements CopyableInterface, SaveableInterface {
public class MyInterface2 implements AllInterface {
    @Override
    public void save() {
        System.out.println("save함");
    }

    @Override
    public void copy() {
        System.out.println("copy함");
    }

    @Override
    public void print() {
        System.out.println("print함");
    }
}