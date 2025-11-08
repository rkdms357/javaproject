package com.shinhan.day07;

import com.shinhan.day06.inheritence.Account;
import com.shinhan.day06.inheritence.BonusPointAccount;
import com.shinhan.day06.inheritence.CheckingAccount;
import com.shinhan.day06.inheritence.CreditLineAccount;

class Parent {
    int a = 100;

    void call1() {
        System.out.println("부모의 call1()메서드");
    }
}

class Child extends Parent {
    int b = 200;

    void call2() {
        System.out.println("자식의 call2()메서드");
    }

    // 함수의 시그니처를 똑같고 Modifier는 같거나 더 넓어질 수 있음
    public void call1() {
        System.out.println("###Child에서 부모의 call1()메서드를 재정의함");
    }
}

class Child2 extends Parent {
    int b = 200;

    void call3() {
        System.out.println("자식의 call3()메서드");
    }

    // 함수의 시그니처를 똑같고 Modifier는 같거나 더 넓어질 수 있음
    public void call1() {
        System.out.println("---Child2에서 부모의 call1()메서드를 재정의함");
    }
}

public class InheritenceTest {
    public static void main(String[] args) {
//		f1();
        f2();
//		f3();
//		f4();
//		f5();
    }

    private static void f5() {
        // 부모타입 객체 = 자식instance
        Parent p1 = new Child();
        Parent p2 = new Child2();
        Child c = (Child) p1;
        // Child2 c2 = (Child2)p1; //컴파일시에는 오류없음. 실행시에는 오류!!
        Child c3 = (Child) p1;
    }

    private static void f4() {
        // 부모타입 객체 = 자식instance
        Parent ch2 = new Child();
        // 자식타입 객체 = (자식타입)부모타입 객체
        Child ch3 = (Child) ch2;
        System.out.println(ch3.a);
        System.out.println(ch3.b);
        ch3.call1();
        ch3.call2();
    }

    private static void f3() {
        Child ch1 = new Child();
        Parent ch2 = new Child();
        Parent ch3 = new Child2();
        // 필드는 타입을 따름. 메서드가 보이는 거는 타입을 따름.
        // 오버라이드된 메서드는 인스턴스를 따름
        System.out.println(ch2.a);
        ch2.call1();
        ch3.call1();
    }

    private static void f2() {
        // 참조형 형변환
        // 자식이 메서드를 재정의했다면 자식메서드가 수행됨. 아니면 부모메서드가 수행됨
        // 1. 자동형변환 -> 부모 = 자식
        // 2. 강제형변환 -> 자식 = (자식 타입)부모
        Account[] arr = new Account[4];
        arr[0] = new Account("111", "홍", 500);
        arr[1] = new BonusPointAccount("112", "김", 100, 500);
        arr[2] = new CheckingAccount("113", "박", 200, "888");
        arr[3] = new CreditLineAccount("114", "양", 300, 2000);
        for (Account acc : arr) {
            call2(acc);
        }
        // call2(arr[1]);
    }

    private static void call2(Account acc) {
        if (acc instanceof BonusPointAccount obj) {
            //BonusPointAccount obj = (BonusPointAccount) acc;
            System.out.println(obj.bonusPoint);
        } else {
            System.out.println("bonusPoint 없음");
        }
    }

    private static void call(Account acc1) {
        acc1.deposite(12345);
        int amount = acc1.withdraw(4444);
        System.out.println("출금: " + amount);
        System.out.println(acc1); // BonusPointAccount만 toString()이 재정의되어있음
    }

    private static void f1() {
        // 기본형 형변환
        // 1. 자동형변환 -> 큰방 = 작은값
        int a = 100; // 4byte
        double b; // 8byte
        b = a;
        System.out.println(b);
        // 2. 강제형변환 -> 작은 방 = (작은방 타입)큰값
        a = (int) b;
        System.out.println(a);
    }
}