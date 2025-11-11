package com.shinhan.day13.q15;

public class Student2 implements Comparable<Student2> {
    public String id;
    public int score;

    public Student2(String id, int score) {
        super();
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student2 obj) {
        return score - obj.score; //점수로 Ascending
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student2 [id=").append(id).append(", score=").append(score).append("]");
        return builder.toString();
    }
}