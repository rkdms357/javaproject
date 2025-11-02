package com.shinhan.day07.lab8_2;

public class RectTriangle extends Shape {
    double width;
    double height;

    public RectTriangle(double w, double h) {
        super(3);
        width = w;
        height = h;
    }

    @Override
    double getArea() {
        return width * height / 2;
    }

    @Override
    double getPerimeter() {
        double hypotenuse = Math.sqrt(width * width + height * height);
        return width + height + hypotenuse;
    }
}