package com.shinhan.day07.lab7_2;

public class Rectangle extends Shape {
    int width;
    int length;

    //부모 생성자 호출 → color, type 초기화
    public Rectangle(String color, int width, int length) {
        super(color, "Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double calculatorArea() {
        return width * length;
    }

    @Override
    double calculatorPerimeter() {
        return 2 * (width + length);
    }
}