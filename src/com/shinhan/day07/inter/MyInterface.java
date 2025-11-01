package com.shinhan.day07.inter;

//두개의 객체를 연결하는 역할, 생성자 없음, 멤버 변수없음
//interface는 규격서 : 상수 + 구현클래스들의 규칙들
public interface MyInterface {

    //멤버변수 불가능
    //int a;

    //생성자 불가능
    //MyInterface(){}

    //1. 상수
    int MAX_VAULE = 100; //public static final 생략됨
    public static final int MAX_VAULE2 = 100;

    //2. 추상메서드 ..정의 있고 구현은 없다 {}불가
    void method1();
    public abstract void method2();

    //3. 디폴트메서드 ..
    public default void method3() {
        System.out.println("MyInterface의 default method.. 구현 class가 재정의 가능");
        method5();
    }

    //4. static 메서드
    public static void method4() {
        System.out.println("MyInterface의 static method.. 구현 class가 재정의 불가능");
        method6();
    }

    //5. private 메서드
    private void method5() {
        System.out.println("MyInterface의 private method.. interface내에서만 접근 가능");
    }

    //6. private static 메서드
    private static void method6() {
        System.out.println("MyInterface의 private static method.. interface내에서만 접근 가능");
    }
}