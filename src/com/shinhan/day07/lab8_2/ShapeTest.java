package com.shinhan.day07.lab8_2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] arr = new Shape[2];
        arr[0] = new Rectangle(5, 6);
        arr[1] = new RectTriangle(6, 2);

        for (Shape s : arr) {
            System.out.printf("area: %3.1f\n", s.getArea());
            System.out.printf("perimeter: %3.1f\n", s.getPerimeter());
            if (s instanceof Resizable re) {
                re.resize(0.5);
                System.out.printf("new area: %3.1f\n", s.getArea());
                System.out.printf("new perimeter: %f\n", s.getPerimeter());
            }
        }
    }
}