package com.shinhan.day07.lab7;

//abstract class : 추상 메서드를 포함할 수 있는 클래스
//객체를 직접 생성할 수 없고, 반드시 자식 클래스를 통해서만 사용 가능
public abstract class Vehicle {
    String name;
    int speed;

    //생성자 : 자식 클래스에서 super()를 호출하기 때문에 반드시 필요함
    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void start() {
        System.out.println(name + "출발합니다. (속도: " + speed + "km/h)");
    }

    void stop() {
        System.out.println(name + "멈춥니다.");
        System.out.println("---------------");
    }

    void info(){
        System.out.println("차량명: " + name);
        System.out.println("최고속도: " + speed);
        extraInfo(); //자식 클래스에서 구현된 세부 정보 출력
    }

    //추상 메서드 : 자식 클래스가 반드시 구현해야 하는 메서드
    abstract void extraInfo();
}