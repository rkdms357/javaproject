package com.shinhan.day14;

import java.util.function.*;
import com.shinhan.day13.q15.Student2;

class MyClass {
    static int method1(int a, int b) {
        return a + b;
    }

    int method2(String a, String b) {
        return a.compareToIgnoreCase(b);
    }
}

//@FunctionalInterface
//->람다로 쓸 수 있는 형태인지(추상 메서드 1개인지)를 확인시켜줌
//람다표현식으로 안쓴다면 인터페이스를 따로 만들어야함
interface MyInterface {
    int method(int a, int b);
}

public class Review {
    public static void main(String[] args) {
        f3();
    }

    private static void f3() {
        //(정수, 정수) -> 정수
        BiFunction<Integer, Integer, Integer> lambda1 = MyClass::method1;
        System.out.println(lambda1.apply(10, 20));

        //(문자, 문자) -> 정수
        MyClass my = new MyClass();
        BiFunction<String, String, Integer> lambda2 = my::method2;
        System.out.println(lambda2.apply("A", "c"));

        BiFunction<String, String, Integer> lambda3 = String::compareToIgnoreCase; //클래스 따로 안만들고 String메서드를 사용
        System.out.println(lambda3.apply("A", "c"));
    }

    private static void f2() {
        //문자 -> 숫자 예)"100" -> 100
        Function<String, Integer> lambda1 = s -> Integer.parseInt(s);
        Function<String, Integer> lambda2 = Integer::parseInt;

        System.out.println(lambda1.apply("100") + 200);
        System.out.println(lambda2.apply("100") + 200);

        //(학번(문자), 점수(숫자)) -> Student2
        BiFunction<String, Integer, Student2> lambda3 = (num, score) -> new Student2(num, score);
        System.out.println(lambda3.apply("123", 99));

        BiFunction<String, Integer, Student2> lambda4 = Student2::new;
        System.out.println(lambda4.apply("123", 99));
    }

    private static void f1() {
        //(정수, 정수)->정수(리턴값) 람다표현식을 컴파일러가 ==> 익명구현클래스로변경
        MyInterface my1 = new MyInterface() {

            @Override
            public int method(int a, int b) {
                //return a > b ? a : b;
                return Math.max(a, b);
            }
        };
        MyInterface my2 = (a, b) -> a > b ? a : b;
        MyInterface my3 = (a, b) -> Math.max(a, b);
        MyInterface my4 = Math::max;
        System.out.println(my1.method(1, 2));
        System.out.println(my2.method(1, 2));
        System.out.println(my3.method(1, 2));
        System.out.println(my4.method(1, 2));

        BiFunction<Integer, Integer, Integer> lambda1 = Math::max;
        System.out.println(lambda1.apply(1, 2));
        BinaryOperator<Integer> lambda2 = Math::max;
        System.out.println(lambda2.apply(1, 2));
    }
}