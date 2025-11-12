package com.shinhan.day14;

public class HighStudent {
    private String name;
    private String sex;
    private int score;

    public HighStudent(String name, String sex, int score) {
        super();
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("HighStudent [name=").append(name).append(", sex=").append(sex).append(", score=").append(score)
                .append("]");
        return builder.toString();
    }
}