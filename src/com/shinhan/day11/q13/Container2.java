package com.shinhan.day11.q13;

//public class Container2<K, M> {
public class Container2<String, T> {
    String key; //K key
    T value; //M value

    void set(String key, T value) {
        this.key = key;
        this.value = value;
    }

    String getKey() {
        return key;
    }

    T getValue() {
        return value;
    }
}