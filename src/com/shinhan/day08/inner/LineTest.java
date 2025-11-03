package com.shinhan.day08.inner;

public class LineTest {
    public static void main(String[] args) {
        Line line = new Line(1, 2, 3, 4);
        line.move(5, 6);

        System.out.println(line.point1);
        System.out.println(line.point2);

        Line.Point pp = new Line.Point(10, 20);
    }
}