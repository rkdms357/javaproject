package com.shinhan.day05.lab5_2;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] arr = new Employee[4];
        arr[0] = new Employee("2020", "이부장", 1500000);
        arr[1] = new Employee("2021", "김과장", 1300000);
        arr[2] = new Employee("2022", "최대리", 1200000);
        arr[3] = new Employee("2023", "박사원", 1000000);

        for (Employee emp : arr) {
            System.out.println(emp);
            double salary = emp.getSalary(2);
            System.out.println(salary);
        }
    }
}