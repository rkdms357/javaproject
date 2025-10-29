package com.shinhan.day05;

public class PersonApp {
    public static void main(String[] args) {
        System.out.println(Person.getNumberOfPerson() + "명");
        Person p1 = new Person();
        Person p2 = new Person(20, "홍길동");

        System.out.println(p1.getName() + ":" + p1.getAge());
        System.out.println(p2.getName() + ":" + p2.getAge());
        System.out.println(Person.getNumberOfPerson() + "명");

        p1.setName("아무개");
        p1.setAge(30);
        System.out.println(p1.getName() + ":" + p1.getAge());
    }
}