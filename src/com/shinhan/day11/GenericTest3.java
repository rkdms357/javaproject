package com.shinhan.day11;

//매개변수에 제한 (와일드카드이용)
public class GenericTest3 {
    public static void main(String[] args) {
        Applicant<Person> app1 = new Applicant<>(new Person());
        Applicant<Student> app2 = new Applicant<>(new Student());
        Applicant<Worker> app3 = new Applicant<>(new Worker());
        Applicant<HighStudent> app4 = new Applicant<>(new HighStudent());
        Applicant<MiddleStudent> app5 = new Applicant<>(new MiddleStudent());

        Course.registerCourse1(app1);
        Course.registerCourse1(app2);
        Course.registerCourse1(app3);
        Course.registerCourse1(app4);
        Course.registerCourse1(app5);

        //Course.registerCourse2(app1); 사용불가
        Course.registerCourse2(app2);
        //Course.registerCourse2(app3); 사용불가
        Course.registerCourse2(app4);
        Course.registerCourse2(app5);

        Course.registerCourse3(app1);
        //Course.registerCourse3(app2); 사용불가
        Course.registerCourse3(app3);
        //Course.registerCourse3(app4); 사용불가
        //Course.registerCourse3(app5); 사용불가
    }
}