package com.shinhan.day04;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
//		f1();
//		f2();
//		f3();
        f4();
    }

    private static void f4() {
        System.out.println(Student.cnt);
        Student st1 = new Student("홍길동1");
        Student st2 = new Student("홍길동2", "20251234");
        Student st3 = new Student("홍길동3", "20251234", new int[]{100, 99, 88});
        Student st4 = new Student();
        System.out.println(Student.cnt);
    }

    private static void f3() {
        Student st1 = new Student("홍길동");
        st1.print();
    }

    private static void f2() {
        Student st1 = new Student("홍길동", "20251234", new int[]{100, 99, 88});

        st1.print();
    }

    private static void f1() {
        //객체 생성
        Student st1 = new Student();

        st1.stdName = "홍길동";
        st1.stdNo = "20251234";
        st1.score = new int[]{100, 99, 88};
        st1.print();
    }
}