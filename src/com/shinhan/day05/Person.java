package com.shinhan.day05;

//javaBeans기술 : 필드는 외부에서 접근 불가(정보 은닉)--private, getter/setter
public class Person {

    private static int numberOfPerson;
    private int age;
    private String name;

    Person() {
        this(12, "Anonymous");
    }

    Person(int age, String name) {
        this.age = age;
        this.name = name;
        numberOfPerson++;
    }

    public static int getNumberOfPerson() {
        return numberOfPerson;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}