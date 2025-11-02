package com.shinhan.day07.lab7_2;

public class Circle extends Shape {
    private double radius;
    private double circumference;

    //부모 생성자 호출 → color, type 초기화
    public Circle(String color, double radius) {
        super(color, "Circle");
        this.radius = radius;
    }

    @Override
    double calculatorArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double calculatorPerimeter() {
        circumference = 2 * radius * Math.PI;
        return circumference;
    }

    public double getRadius() {
        return radius;
    }
}