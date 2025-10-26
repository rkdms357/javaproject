package com.shinhan.day02;

public class OperatorTest {

    public static void main(String[] args) {
        f1();
        f2();
        f3();
        f4();
        f5();
        f6();
        System.out.println("main...End");
    }

    private static void f6() {
        int a = 10;
        boolean b = a % 2 == 0;
        String c = b ? "짝수" : "홀수";
        System.out.println(c);

        System.out.println(a % 2 == 0 ? "짝수" : "홀수");
        String result;
        if(a % 2 == 0){
            result = "짝수";
        } else {
            result = "홀수";
        }
        System.out.println(result);
    }

    private static void f5() {
        int a = 10;
        ++a;
        ++a;
        a += 20;
        a += 30;
        System.out.println(a);
    }

    private static void f4() {
        String s1 = "자바";
        String s2 = "자바";
        System.out.println(s1 == s2);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        //문자열 리터럴 "자바"는 상수 풀(String Pool)에 저장
        //리터럴이 동일하면 JVM은 같은 객체를 재사용

        s1 = s1 + "프로그램";
        s2 = s2 + "프로그램";
        System.out.println(s1 == s2);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1.equals(s2));
        //s1 + "프로그램" 연산은 새로운 문자열 객체를 생성
        //따라서 s1과 s2는 각각 다른 새로운 객체를 가리키게 됨
    }

    private static void f3() {
        int a = 10;
        int b = 20;
        char ch1 = 'A';
        char ch2 = 'A';
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(ch1 == ch2);
    }

    //double / 0.0 -> Infinity
    //double % 0.0 -> NaN
    private static void f2() {
        int a = 10;
        int b = call();
        double c = call2();
        System.out.println((double)a / c);
        System.out.println(Double.isInfinite((double)a / c));
        System.out.println((double)a % c);
        System.out.println(Double.isNaN((double)a % c));
        System.out.println("f2함수...End");
    }

    private static double call2() {
        return (double)0.0F;
    }

    private static int call() {
        return 0;
    }

    private static void f1() {
        int a = 10;
        ++a;
        ++a;
        ++a;
        System.out.println(a++);
        ++a;
        System.out.println(a);
    }
}
