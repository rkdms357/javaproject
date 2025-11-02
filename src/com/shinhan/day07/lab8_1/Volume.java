package com.shinhan.day07.lab8_1;

public interface Volume {

    //추상 메서드: 반드시 자식 클래스에서 구현해야 함
    void volumeDown(int level);
    void volumeUp(int level);

    //인터페이스의 변수는 자동으로 public static final이 붙음
    //상수로 취급됨 (변경 불가)
    int A = 100; //static final이 생략되어 있음

    //default 메서드: 인터페이스에서 구현을 가질 수 있음 (자식이 선택적으로 오버라이드 가능)
    default void f1() {
    }

    //static 메서드: 인터페이스 이름으로 직접 호출 가능 (Volume.f2();)
    static void f2() {
    }
}