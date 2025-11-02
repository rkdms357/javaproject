package com.shinhan.day07.lab7_2;

public class TestShape {
    public static void main(String args[]) {

        //Shape는 추상클래스이므로 객체를 직접 생성할 수 없음
        //하지만 Shape 타입의 '참조 변수 배열'은 만들 수 있음
        //Shape[] 배열은 Shape를 상속받은 객체(Circle, Rectangle 등)를 담을 수 있음
        Shape[] s = new Shape[3];
        s[0] = new Circle("BLUE", 10);
        s[1] = new Rectangle("RED", 5, 7);
        s[2] = new Circle("GREEN", 8);

        for (int i = 0; i < 3; i++) {
            System.out.print("Shape " + i + " is a " + s[i] + " with an area of " + s[i].calculatorArea());

            if (s[i] instanceof Circle cc) {
                System.out.print(", a radius of " + cc.getRadius());
            }
            System.out.println(", and a perimeter of " + s[i].calculatorPerimeter());
        }
    }
}