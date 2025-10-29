package com.shinhan.day05;

public class TestAccount {
    public static void main(String[] args) {
        System.out.println(Account.LOCATION);

        int max = Integer.MAX_VALUE;
        double pi = Math.PI;
        System.out.println(pi);

        Account acc = new Account("078-3762-293", 1000000);
        Account acc2 = new Account("333-3762-293", 1000000);
        acc.deposit(2000000);
        acc.withdraw(500000);
//		System.out.println(acc.getBalance());
//		System.out.println(acc.getAccNo());
        System.out.println("계좌의 개수 : " + Account.getCnt());

        //수정불가....acc.bank = "신한은행";
        System.out.println(acc.bank);
        System.out.println(acc2.bank);
    }
}