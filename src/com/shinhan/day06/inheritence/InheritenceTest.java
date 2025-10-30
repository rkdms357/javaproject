package com.shinhan.day06.inheritence;

public class InheritenceTest {
    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }

    private static void f3() {
        CreditLineAccount acc;
        acc = new CreditLineAccount("1234-56", "김길동", 1000, 2000);
    }

    private static void f2() {
        CheckingAccount acc =
                new CheckingAccount("112-33", "홍길동", 100, "999-888");
        acc.deposite(1000);
        acc.deposite(2000);
        int amount = acc.withdraw(500);
        int amount2 = acc.pay("999-888", 600);
        System.out.println(acc.getAccNo());

        System.out.println(amount + "출금");
        System.out.println(amount2 + "카드로 출금");
        System.out.println(acc);
    }

    private static void f1() {
        CheckingAccount acc = new CheckingAccount();

        acc.deposite(100);
        acc.deposite(200);
        System.out.println(acc.withdraw(150));
        System.out.println(acc);
    }
}