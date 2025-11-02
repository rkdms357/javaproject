package com.shinhan.day07.lab7_2;

public abstract class Shape {

    //추상 클래스(abstract class)
    //공통 속성과 기능은 정의, 세부 내용(면적,둘레 계산)은 자식이 구현하도록 함
    private String color;
    private String type;

    //생성자: 공통 속성(color, type)을 초기화
    public Shape(String color, String type) {
        super();
        this.color = color;
        this.type = type;
    }

    //추상 메서드: 자식 클래스에서 반드시 재정의해야 함
    abstract double calculatorArea();
    abstract double calculatorPerimeter();

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    //Object의 toString()을 오버라이드
    @Override
    public String toString() {
        return color + " " + type;
    }
}