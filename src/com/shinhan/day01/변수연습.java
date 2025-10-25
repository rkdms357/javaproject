package com.shinhan.day01;

//>java 변수연습
//JVM이 class를 메모리에 Load함
//JVM이 main을 찾아서 실행

/**
 * class이름은 대문자 시작
 * 예약어는 소문자 시작
 * 변수, 함수명은 소문자 시작
 */

public class 변수연습 {
    //함수(기능): 문장들의 묶음
    public static void main(String[] args) {
        f1(); //함수호출
        f2(); //함수호출
        f3(); //함수호출
        f4(); //함수호출
        f5(); //함수호출
        f6(); //함수호출
        f7(); //함수호출
        f8(); //함수호출
    }

    //자바의 예약어는 모두 소문자
    private static void f8() {
        //true, false 저장
        boolean var1 = true;
        boolean var2 = 10>20; //false
        System.out.println("boolean: " + var1);
        System.out.println("boolean: " + var2);
    }

    private static void f7() {
        //실수: 소수점 있음. float-4, double-8
        //실수값의 기본은 double
        //지수부, 가수부로 나누어 저장. 범위는 long보다 큰 수
        //크기: boolean(true, false)
        //byte < short < int < long < float < double
        //byte < char < int < long < float < double
        float var1 = 3.14159234567890f; //f, F
        double var2 = 3.14159234567890;
        System.out.println("float-4: " + var1);
        System.out.println("double-8: " + var2);
    }

    private static void f6() {
        //지역변수는 선언후 반드시 초기화하고 사용
        //Variable 'var1' might not have been initialized
        //초기화 안하면 사용불가
        //char는 단일문자
        char var1 = 'A'; //문자
        char var2 = 65; //10진수
        char var3 = 0x0041; //16진수
        System.out.println("정수(char-2): " + var1);
        System.out.println("정수(char-2): " + var2);
        System.out.println("정수(char-2): " + var3);
    }

    //자바의 정수 리터럴(값)은 int가 기본
    //숫자값 뒷부분에 L,l을 붙여야 함
    //int범위 벗어나면 반드시 L,l을 붙여야 함
    //int범위 벗어나지 않으면 자동형변환 됨

    private static void f5() {
        //정수(long-8)
        long var1;
        var1 = 2147483648L;
        var1++;var1++;var1++;
        System.out.println("정수(long-8): " + var1);
    }

    private static void f4() {
        //정수(int-4)
        int var1;
        var1 = Integer.MAX_VALUE;
        var1++;var1++;var1++;
        System.out.println("정수(int-4): " + var1);
    }

    private static void f3() {
        //정수(short-2)
        short var1;
        var1 = 32767;
        var1++;var1++;var1++;
        System.out.println("정수(short-2): " + var1);
    }

    private static void f2() {
        //정수(byte-1)
        //1.변수 선언
        byte var1;
        //2.값 할당
        var1 = 127;
        var1++;var1++;var1++;
        //3.값 읽기
        System.out.println("정수(byte-1): " + var1);
    }

    private static void f1() {
        //변수: 변하는 값을 저장하기 위한 기억장소이름
        //반드시 신언후 사용가능
        //선언시 저장할 data의 성격 필수
        //8가지 기본타입
        //정수(byte-1, short-2, char-2, int-4, long-8)
        //실수(float-4, double-8)
        //논리(boolean-1)
        System.out.println("변수: 기억장소이름");
    }
}
