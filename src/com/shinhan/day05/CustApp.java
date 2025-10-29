package com.shinhan.day05;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/*
 * 고객관리(등록, 수정, 모두조회, 조건조회, 삭제)
 * 고객(고객번호, 이름, 전화번호, 생일, 등록일, level(gold, silver, bronze))
 */
public class CustApp {
    static Scanner sc = new Scanner(System.in);
    static CustomerManagement customerManagement = new CustomerManagement();

    public static void main(String[] args) {
        boolean isContinue = true;
        while (isContinue) {
            menuPrint();
            String jobSelect = sc.next();
            switch (jobSelect) {
                case "insert", "I" -> {
                    f_insert();
                }
                case "update", "U" -> {
                    f_update();
                }
                case "selectall", "A" -> {
                    f_selectAll();
                }
                case "condition", "C" -> {
                    f_condition();
                }
                case "condition2", "C2" -> {
                    f_condition2();
                }
                case "delete", "D" -> {
                    f_delete();
                }
                case "quit", "Q" -> {
                    isContinue = false;
                }
                default -> {
                }
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void f_condition2() {
        System.out.println("조회할 전화번호>> ");
        String phoneNumber = sc.next();
        customerManagement.select_condition2(phoneNumber);
    }

    private static void f_condition() {
        System.out.println("조회할 level(gold, silver, bronze)>> ");
        String level = sc.next();
        customerManagement.select_condition(level.toUpperCase());
    }

    private static void f_delete() {
        System.out.print("삭제할 고객번호>> ");
        String custNo = sc.next();
        customerManagement.delete(custNo);
    }

    private static void f_update() {
        System.out.print("수정할 고객번호>> ");
        String custNo = sc.next();
        System.out.print("고객이름 전화번호>> ");
        String custName = sc.next();
        String phoneNumber = sc.next();
        customerManagement.update(custNo, custName, phoneNumber);
    }

    private static void f_selectAll() {
        customerManagement.selectAll();
    }

    // 지역변수는 초기화되어야 사용가능
    //null을 안붙여도 되는 이유는 이미 넣고 사용했기 때문
    private static void f_insert() {
        Customer cust;
        System.out.print("고객번호 고객이름 전화번호>> ");
        String custNo = sc.next();
        String custName = sc.next();
        String phoneNumber = sc.next();
        System.out.print("생일(년도 월 일)>> ");
        LocalDate dt = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        cust = new Customer(custNo, custName, phoneNumber, dt, CustomerLevel.BRONZE);
        customerManagement.insert(cust);
    }

    private static void menuPrint() {
        System.out.println("----------------------------------");
        System.out.println("insert(I), update(U), selectall(A)");
        System.out.println("condition(C), delete(D), quit(Q)");
        System.out.println("----------------------------------");
        System.out.print("직업선택> ");
    }
}