package com.shinhan.day11;

//매개변수에 제한 (와일드카드이용)
public class Course {
    //Person, Worker, Student, HighStudent, MiddleStudent
    public static void registerCourse1(Applicant<?> app) {
        System.out.println(app.kind.getClass().getSimpleName() + "과정등록1");
    }

    //Student, HighStudent, MiddleStudent
    public static void registerCourse2(Applicant<? extends Student> app) {
        System.out.println(app.kind.getClass().getSimpleName() + "과정등록2");
    }

    //Worker, Person
    public static void registerCourse3(Applicant<? super Worker> app) {
        System.out.println(app.kind.getClass().getSimpleName() + "과정등록3");
    }
}