package com.shinhan.day07.lab8_2;
//Shape 추상 클래스: 도형의 공통 속성을 정의
public abstract class Shape {

    int numSides;

    //생성자: 도형의 변 개수를 초기화
    public Shape(int numSides) {
        this.numSides = numSides;
    }

    //변 개수를 반환하는 getter
    public int getNumSides() {
        return numSides;
    }

    //추상 메서드: 자식 클래스에서 구현
    abstract double getArea();
    abstract double getPerimeter();
}