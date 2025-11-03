package com.shinhan.day08.inner;

public class Line {
    Point point1, point2;

    Line(int x1, int y1, int x2, int y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }

    void move(int offsetX, int offsetY) {
        point1.x += offsetX;
        point1.y += offsetY;
        point2.x += offsetX;
        point2.y += offsetY;
    }

    //외부에서 new하기 : new Line.Point(10, 20);
    //내부에서 new하기 : new Point(10, 20);
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point [x=" + x + ", y=" + y + "]";
        }
    }
}