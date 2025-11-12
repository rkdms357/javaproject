package com.shinhan.day14.q16;

@FunctionalInterface
interface MyFunction2<T> {
    public double apply(T t);
}

public class StudentExample {
    private static int[] scores = {10, 50, 3};
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93),
    };

    public static void main(String[] args) {
        double englishAvg = avg(s -> s.getEnglishScore());
        //double englishAvg = avg(Student::getEnglishScore);

        double mathAvg = avg(s -> s.getMathScore());
        //double mathAvg = avg(Student::getMathScore());

        System.out.println("영어: " + englishAvg);
        System.out.println("수학: " + mathAvg);
    }

    private static double avg(MyFunction2<Student> func) {
        //student의 평균을 구해서 return
        double total = 0;
        for (Student st : students) {
            total += func.apply(st);
        }
        return total / students.length;
    }
}