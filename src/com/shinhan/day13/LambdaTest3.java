package com.shinhan.day13;

import java.util.function.*;

import com.shinhan.day13.q15.Student;
import com.shinhan.day13.q15.Student2;

public class LambdaTest3 {
    public static void main(String[] args) {
        f5();
    }

    private static void f5() {
        //조사하기
        int score = 88;
        Predicate<Integer> lambda1 = (jumsu) -> jumsu >= 90;
        Predicate<Student2> lambda2 = (st) -> st.score >= 90;
        boolean result = lambda1.test(score);
        boolean result2 = lambda2.test(new Student2("12", score));
        System.out.println(result);
    }

    private static void f4() {
        BinaryOperator<Integer> lambda1 = (a, b) -> 100;
        Integer result = lambda1.apply(1, 2);
        System.out.println(result);
    }

    private static void f3() {
        //공급과 소비 : Function
        Function<String, Integer> lambda1 = (s) -> {
            System.out.println("문자를 받고 숫자를 return합니다");
            return Integer.parseInt(s) + 100;
        };
        Integer result = lambda1.apply("300");
        System.out.println(result);

        BiFunction<String, Integer, String> lambda2 = (str, su) -> {
            System.out.println("문자를 받고 숫자를 return합니다");
            return str + ":" + su;
        };
        String result2 = lambda2.apply("300", 200);
        System.out.println(result2);

        IntFunction<Student> lambda3 = (su2) -> {
            return new Student("123", su2 + "");
        };
        Student st1 = lambda3.apply(500);
        System.out.println(st1);
    }

    private static void f2() {
        //Supplier(공급자) : 매개값이 없고 return 있음
        Supplier<String> lambda1 = () -> "문자를 공급합니다1";
        Supplier<String> lambda2 = () -> {
            return "문자를 공급합니다2";
        };
        Supplier<Student> lambda3 = () -> {
            return new Student("123", "홍");
        };

        String s1 = lambda1.get();
        Student s2 = lambda3.get();
        System.out.println(s1);
        System.out.println(s2.getName());
    }

    private static void f1() {
        //Consumer(소비자) : 매개값이 있고 return 없음
        Consumer<String> lambda1 = str -> System.out.println(str); //인터페이스 만들지 않고 사용
        BiConsumer<String, Integer> lambda2 = (str, su) -> {
            System.out.println("문자" + str);
            System.out.println("숫자" + su);
        };
        lambda1.accept("문자전달");
        lambda2.accept("자바", 100);
    }
}