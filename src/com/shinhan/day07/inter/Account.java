package com.shinhan.day07.inter;

//DTO(Data Transfer Object)
//final class : 상속받은 하위 class만들기 불가
//final field : 값 변경 불가
//final method : 함수 재정의 불가
public class Account {
    private String accNo;
    private String owner;
    private int balance;

    //default 생성자를 만들어야함!!!
    public Account() {
        //super(); 부모의 생성자를 호출 Object()수행
        System.out.println("Account생성자");
    }

    public Account(String accNo, String owner, int balance) {
        super();
        this.accNo = accNo;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposite(int amount) {
        balance += amount;
    }

    public int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return amount;
        } else {
            return 0;
        }
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return owner + "님\n" + "계좌번호: " + accNo + ", 잔고는 " + balance + "원 입니다.";
    }
}