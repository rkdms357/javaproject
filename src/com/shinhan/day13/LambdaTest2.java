package com.shinhan.day13;

@FunctionalInterface
interface Speakable {
    void speak(String content);
}

@FunctionalInterface
interface Workable {
    void work(String name, String job);
}

@FunctionalInterface
interface Calculable {
    double calc(double x, double y);
}

class Person {
    public void action(Workable workable) {
        workable.work("홍길동", "프로그래밍");
    }

    public void action2(Speakable speakable) {
        speakable.speak("안녕하세요");
    }

    public void action3(Calculable calculable, double su1, double su2) {
        double result = calculable.calc(su1, su2);
        System.out.println("---결과: " + result);
    }
}

public class LambdaTest2 {
    public static void main(String[] args) {
        f1();
    }

    private static void f1() {
        Person p1 = new Person();
        p1.action(new Workable() {
            @Override
            public void work(String name, String job) {
                System.out.println(name + " 직업은 " + job + "입니다.(익명구현클래스)");
            }
        });
        p1.action((name, job) -> {
            System.out.println(name + " 직업은 " + job + "입니다.(람다식)");
        });
        p1.action2(str -> System.out.println(str + "(람다식1)"));
        p1.action2(str -> System.out.println(str + "(람다식2)"));
        Calculable cc = new Calculable() {
            @Override
            public double calc(double x, double y) {
                return x - y;
            }
        };
        p1.action3(cc, 10, 30);
        Calculable cc2 = (x, y) -> x + y;
        p1.action3(cc2, 10, 30);
    }
}