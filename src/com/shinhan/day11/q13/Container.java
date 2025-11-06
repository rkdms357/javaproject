package com.shinhan.day11.q13;

public class Container<T> {

    T data;

    public Container() {
        super();
    }

    T get() {
        return data;
    }

    void set(T data) {
        this.data = data;
    }
}