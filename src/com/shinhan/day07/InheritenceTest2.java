package com.shinhan.day07;

public class InheritenceTest2 {
    public static void main(String[] args) {
        //Animal ani = new Animal("", "");

        Dog dog = new Dog("멍멍이", "white", 100);
        Cat cat = new Cat("야옹이", "black");

        call(dog);
        call(cat);
    }

    private static void call(Animal ani) {
        //Animal ani : 자동형변환되어 들어감

        System.out.println("--------------");
        System.out.println(ani.name);
        System.out.println(ani.color);
        ani.sing();

        if (ani instanceof Dog d) {
            //Dog d = (Dog)ani;
            System.out.println(d.a);
            d.f1();
        } else if (ani instanceof Cat c) {
            //Cat c = (Cat)ani;
            System.out.println(c.b);
            c.method();
        }
    }
}