package com.shinhan.day07.lab8_2;

public class Rectangle extends Shape implements Resizable {
    double width;
    double height;

    public Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double s) {
        width *= s;
        height *= s;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width + height) * 2;
    }
}