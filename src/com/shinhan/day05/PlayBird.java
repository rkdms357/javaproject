package com.shinhan.day05;

public class PlayBird {
    public static void main(String[] args) {
        Duck duck = new Duck("꽥꽥이", 2, 15);
        Sparrow sparrow = new Sparrow("짹짹", 2, 10);

        duck.fly();
        duck.sing();
        String result = duck.toString();
        System.out.println(result);

        sparrow.fly();
        sparrow.sing();
        String result2 = sparrow.toString();
        System.out.println(result);
    }
}