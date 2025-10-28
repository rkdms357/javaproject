package com.shinhan.day04;

//함수의 오버로딩 : 이름같고 매개변수, return 타입이 다르다.
public class MethodTest {

    void add() {
        System.out.println("매개변수없음, returnType없음");
    }

    void add(int a, int b) {
        System.out.println("매개변수 int-2개, returnType없음" + (a + b));
    }

    String add(String a, String b) {
        System.out.println("매개변수 String-2개, returnString없음" + (a + b));
        return a + b;
    }

    //가변길이 매개변수
    int add(int... arr) {
        int result = 0;
        for (int data : arr) {
            result += data;
        }
        return result;
    }

    /**
     * public : 접근권한, 모든 패키지에서 접근 가능
     * static : 활용방법, class method임을 의미. 객체 생성 없이 접근 가능
     * String : 함수 수행 후 return되는 data의 타입이 문자열임을 의미
     * add : 함수명은 소문자로 시작
     * int data, String msg : 매개변수가 2개있음
     */

    public static String add(int data, String msg) {
        return msg + "==>" + data;
    }

    public static void main(String[] args) {
        System.out.println(add(100, "자바점수"));

        MethodTest obj = new MethodTest();
        obj.add();
        obj.add(10, 20);
        System.out.println(obj.add("자바", "프로그램"));
        System.out.println(obj.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}