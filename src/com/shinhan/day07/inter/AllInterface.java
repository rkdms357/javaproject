package com.shinhan.day07.inter;

//인터페이스는 다중상속 가능
public interface AllInterface extends CopyableInterface, SaveableInterface {

    //1.상수
    //2.추상메서드
    //3.디폴트메서드
    //4.static 메서드
    //5.private 메서드
    //6.private static 메서드

    void print();
}