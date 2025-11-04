package com.shinhan.day09.q12;

public class Member {

    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id).append(": ").append(name);
        return builder.toString();
    }
}