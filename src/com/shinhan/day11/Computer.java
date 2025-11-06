package com.shinhan.day11;

public class Computer {
    String os;

    public Computer(String os) {
        super();
        this.os = os;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Computer [os=").append(os).append("]");
        return builder.toString();
    }
}