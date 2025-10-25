package com.shinhan.day01;

public class 변수연습2 {

    public static void main(String[] args) {
        System.out.println("1.main 시작");
        method1(); //함수를 수행하고 돌아옴
        method2();
        method3();
        method4();
        System.out.println("3.main...End");
    }

    private static void method4() {
        Integer c;
        c = f1();
        if(c != null && c.intValue() > 10) {
            System.out.println(c);
        }else {
            System.out.println("@@@");
        }

        int a  = 10;
        int b = 3;
        System.out.println(Integer.toBinaryString(a)); //1010
        System.out.println(String.format("%4s", Integer.toBinaryString(b)).replace(" ", "0")); //0010
        System.out.println("bit연산: " + (a & b)); //0010

        System.out.println(++a > 20 && ++b > 5);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("더하기: " + (a + b));
        System.out.println("뻬기: " + (a - b));
        System.out.println("곱하기: " + a * b);
        System.out.println("나누기: " + a / b);
        System.out.println("나머지: " + a % b);
    }

    private static Integer f1() {
        return null;
    }

    private static void method3() {
        String var1 = "오늘은 \'강의\' '첫날'입니다. \"자바\""; //오늘은 '강의' '첫날'입니다. "자바"
        String var2 = "이것이 \t자바다. \n저자: 신용권 {\"이름\": \"홍길동\", \"나이\": 20}";
        /*
        이것이	자바다.
        저자: 신용권 {"이름": "홍길동", "나이": 20}
        */
        String var3 = """
                1. 자바
                2. sql
                3. web
                4. framework
                JSON data: {"이름" : "홍길동", "나이": 20}
                """;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }

    private static void method2() {
        int x = 10;
        //boolean result = x == 20;
        //boolean result = x != 20;

        //&&: 모두 참이면 참. 앞의 결과가 거짓이면 뒷부분 수행안함(단축)
        //&: 모두 참이면 참. 앞의 결과가 거짓이더라도 뒷부분 수행
        //boolean result = 0 == x && ++x < 20;
        //boolean result = 0 == x & ++x < 20;

        //||: 하나라도 참이면 참. 앞의 결과가 참이면 뒷부분 수행안함(단축)
        //|: 하나라도 참이면 참. 앞의 결과가 참이더라도 뒷부분 수행
        //boolean result = 0 < x || ++x < 20;
        boolean result = 0 < x | ++x < 20;

        System.out.println("result = " + result); //true
        System.out.println("x = " + x); //11
    }

    private static void method1() {
        System.out.println("2.method1 수행");
        //기본형변수: boolean, byte, short, char, int(기본), long(L, l), float(f, F), double(기본)
        //기본기능: 값 저장, 계산, 비교
        //기본기능 + 추가기능
        //==> Wrapper Class(Boolean, Byte, Short, Character, Integer, Long, Float, Double)
        System.out.println("max: " + Integer.max(10, 20));
        System.out.println("Integer 최대: " + Integer.MAX_VALUE);
        System.out.println("대->소: " + Character.toLowerCase('A'));
    }
}
