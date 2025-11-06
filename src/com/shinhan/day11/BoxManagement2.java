package com.shinhan.day11;

//제네릭메서드
public class BoxManagement2 {
    public <A, B> Box<A, B> makeBox(A kind, B size) {
        return new Box<>(kind, size);
    }
}