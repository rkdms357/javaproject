package com.shinhan.day11;

public class BoxManagement<A, B> {
    public Box<A, B> makeBox(A kind, B size) {
        return new Box<>(kind, size);
    }
}