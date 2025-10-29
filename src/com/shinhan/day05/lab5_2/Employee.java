package com.shinhan.day05.lab5_2;

public class Employee {

    private String id;
    private String name;
    private int baseSalary;

    public Employee(String id, String name, int baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(double bonus) {
        double salary = baseSalary + baseSalary * bonus;
        return salary;
    }

    @Override
    public String toString() {
        return name
                + "("
                + id
                + ") 사원의 기본급은 "
                + baseSalary
                + "원 입니다.\n";
    }
}