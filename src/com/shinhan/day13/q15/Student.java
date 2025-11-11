package com.shinhan.day13.q15;

import java.util.Objects;

public class Student {
    private String studentNum;
    private String name;

    public Student(String studentNum, String name) {
        super();
        this.studentNum = studentNum;
        this.name = name;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return Objects.equals(studentNum, other.studentNum);
    }
}