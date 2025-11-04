package com.shinhan.day09;

class OuterClass {

    class A {}
    static class B {}
    interface C {}
    enum D {}

    //내부에서만 사용가능. 결과가 리턴되는 함수도 있을 것
    private class A2 {}
    private class B2 {}
    private interface C2 {}
    private enum D2 {}
}

public class Review {
    public static void main(String[] args) {}
}