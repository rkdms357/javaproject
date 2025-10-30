package com.shinhan.day06.inheritence;

public class CheckingAccount extends Account {
    String cardNo;

    public CheckingAccount(String accNo, String owner, int balance, String cardNo) {
        super(); //호출은 반드시 첫줄에!!
        setAccNo(accNo);
        setOwner(owner);
        setBalance(balance);
        this.cardNo = cardNo;
        System.out.println("CheckingAccount 생성자(arg4개)");
    }

    public CheckingAccount() {
        //super(); 생략되어있음. 부모의 생성자 호출
        System.out.println("CheckingAccount 생성자");
    }

    int pay(String cardNo, int amount) {
        if (this.cardNo.equals(cardNo)) {
            return withdraw(amount);
        } else {
            System.out.println("카드번호 불일치, 인출불가");
            return 0;
        }
    }
}