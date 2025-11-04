package com.shinhan.day09.q12;

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> datas = new HashSet<>();
        datas.add(new Student("201", "홍길동1", 2, 2));
        datas.add(new Student("202", "홍길동2", 2, 3));
        datas.add(new Student("203", "홍길동3", 4, 2));

        System.out.println(datas.size());

        for (Student s : datas) {
            System.out.println(s);
        }
    }

    public static void main2() {
        Student st1 = new Student("100");
        Student st2 = new Student("200", "홍길동", 2, 2);
        Student st3 = new Student("200", "홍길동", 3, 0);
        System.out.println(st1.getStudentNum());
        System.out.println(st2);

        System.out.println(st2.equals(st3));
    }
}