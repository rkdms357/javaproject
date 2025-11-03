package com.shinhan.day08;

//class -> 변수(속성, 값저장 목적) + 함수(기능, 메서드)
public class CDInfo {

}

//JAVA는 다중상속 불가.
//-> 인터페이스(규격), 상수기능(abstract, default, static, private))를 이용!!
interface Lendable {
    void checkOut(String a, boolean b); //앞에 public abstract가 생략됨

    default void defaultMethod() {
        System.out.println("interface에서 defaultMethod 구현함");
    }

    static void staticMethod() {
        System.out.println("interface에서 staticMethod 구현함");
    }
}

class LendableA implements Lendable {
    @Override
    public void checkOut(String a, boolean b) {
        // TODO Auto-generated method stub

    }

}

class LendableB implements Lendable {
    @Override
    public void checkOut(String a, boolean b) {
        // TODO Auto-generated method stub

    }

}

//기존class에 있는 기능을 재사용. 기존class에 변경하고 싶음
//구현 클래스는 반드시 추상메서드를 구현할 의무가 있음
//->하지만 구현하지 않을거라면 추상클래스가 됨!! 앞에 abstract를 붙여야 함
//->AppCDInfo를 상속받은 AppCDInfoChild가 추상메서드를 구현해야함
abstract class AppCDInfo extends CDInfo implements Lendable {
    abstract void f1();

    @Override
    public void defaultMethod() {
        System.out.println("구현 클래스가 재정의");
    }

    //Override한게 아님
    static void staticMethod() {
        System.out.println("구현 클래스 staticMethod 구현함");
    }
}

class AppCDInfoChild extends AppCDInfo {
    @Override
    public void checkOut(String a, boolean b) {
        System.out.println(a);
        System.out.println(b);
    }

    @Override
    void f1() {

    }
}