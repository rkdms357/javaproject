package com.shinhan.day05.lab5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("이부장", "부장", 15000000);
        Employee e2 = new Employee("김과장", "과장", 13000000);
        Employee e3 = new Employee("최대리", "대리", 12000000);
        Employee e4 = new Employee("박사원", "사원", 10000000);

        e1.print();
        e2.print();
        e3.print();
        e4.print();
    }
}