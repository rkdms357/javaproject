package com.shinhan.day09.q12;

import java.util.Objects;

//@ToString(of = {"studentName"}) 이것만 나옴
//@ToString(exclude = {"studentName"}) 이것만 빼고나옴
//@EqualsAndHashCode(of = {"studentNum"}) 이것만 같으면 같음
public class Student {
    private final String studentNum;
    private String studentName;
    int javaScore;
    int sqlScore;

    public Student(String studentNum) {
        super();
        this.studentNum = studentNum;
    }

    public Student(String studentNum, String studentName) {
        super();
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public Student(String studentNum, String studentName, int javaScore, int sqlScore) {
        super();
        this.studentNum = studentNum;
        this.studentName = studentName;
        this.javaScore = javaScore;
        this.sqlScore = sqlScore;
    }

    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public String toString() {
        return "Student [studentNum=" + studentNum + ", studentName=" + studentName + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(javaScore + sqlScore);
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
        return javaScore + sqlScore == other.javaScore + other.sqlScore;
    }
}