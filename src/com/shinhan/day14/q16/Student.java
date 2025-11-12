package com.shinhan.day14.q16;

import java.io.Serializable;

public class Student implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 6925135112949379959L;
    String name;
    int englishScore;
    int mathScore;

    public Student(String name, int englishScore, int mathScore) {
        super();
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student [name=").append(name).append(", englishScore=").append(englishScore)
                .append(", mathScore=").append(mathScore).append("]");
        return builder.toString();
    }
}