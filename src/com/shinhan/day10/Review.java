package com.shinhan.day10;

import java.util.HashSet;

/**
 * 자바 9.. 모듈추가
 * java.base모듈에 기본적인것들이 들어있음. 패키지들이 들어있음
 * java.lang패키지...클래스, 인터페이스, enum...들이 들어있음
 * Object클래스는 모든 클래스의 부모임
 */
public class Review {
    public static void main(String[] args) {
        f4();
    }

    private static void f4() {
        Person p1 = new Person("홍", 20);
        System.out.println(p1.name());
        System.out.println(p1.age());
        System.out.println(p1.toString());
    }

    private static void f1() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1); //println이 obj1.toString()을 호출함
        System.out.println(obj2); //주소를 리턴함 -> (java.lang.Object@해시코드의 hex값)
        System.out.println(obj1.hashCode()); //해시코드 출력
        System.out.println(System.identityHashCode(obj1)); //해시코드 출력

        //동일성을 체크할때 hashCode(), equals()사용
        System.out.println(obj1.equals(obj2)); //해시코드가 다르므로 다르다고 나옴
    }

    private static void f2() {
        //String은 Object를 상속받음
        //toString() (그문자 자체를 리턴), hashCode() 그문자의 해시코드, equals() 그문자의 값을 비교 재정의되어있음
        String obj1 = new String("자바");
        String obj2 = new String("자바");
        System.out.println(obj1); //println이 obj1.toString()을 호출함
        System.out.println(obj2); //주소를 리턴함 -> (java.lang.Object@해시코드의 hex값)
        System.out.println(obj1.hashCode()); //해시코드 출력. obj에서 재정의된 해시코드가 나옴
        System.out.println(System.identityHashCode(obj1)); //해시코드 출력. 위와는 결과가 다름..

        //동일성을 체크할때 hashCode(), equals()사용
        System.out.println(obj1.equals(obj2)); //내용이 같아서 true.
    }

    private static void f3() {
        //String은 Object를 상속받음
        //toString() (그문자 자체를 리턴), hashCode() 그문자의 해시코드, equals() 그문자의 값을 비교 재정의되어있음
        Car obj1 = new Car("자바", 0, "white");
        Car obj2 = new Car("자바", 0, "white");
        System.out.println(obj1); //println이 obj1.toString()을 호출함
        System.out.println(obj2); //주소를 리턴함 -> (java.lang.Object@해시코드의 hex값)
        System.out.println(obj1.hashCode()); //해시코드 출력. obj에서 재정의된 해시코드가 나옴
        System.out.println(System.identityHashCode(obj1)); //해시코드 출력. 위와는 결과가 다름..

        //동일성을 체크할때 hashCode(), equals()사용
        System.out.println(obj1.equals(obj2));

        //Set은 순서없고 중복 불가
        HashSet<Car> datas = new HashSet<>();
        datas.add(obj1);
        datas.add(obj2);
        datas.add(new Car("자바", 20, "white")); //새로해서 주소가 달라짐
        datas.add(new Car("자바", 10, "white"));
        for (Car car : datas) {
            System.out.println(car);
        }
    }
}