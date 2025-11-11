package com.shinhan.day13.q15;

import java.util.*;

//import lombok.EqualsAndHashCode;
//@EqualsAndHashCode(of = "studentNum")
public class CollectionTest2 {
    public static void main(String[] args) {
        f8();
    }

    private static void f8() {
        Set<Student> set = new HashSet<Student>();
        set.add(new Student("123", "홍"));
        set.add(new Student("123", "홍2"));
        set.add(new Student("123", "홍3"));
        set.add(new Student("123", "홍4"));
        set.add(new Student("123", "홍5"));
        for (Student st : set) {
            System.out.println(st.getStudentNum() + "--" + st.getName());
        }
    }
}