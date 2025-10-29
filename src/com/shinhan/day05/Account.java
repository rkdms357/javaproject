package com.shinhan.day05;

public class Account extends Object {

    //필드(인스턴스 변수)
    private String accNo;
    private int balance;

    //필드(class 변수)
    private static int cnt;

    //non-static(instance변수)
    //필드 : 활용방법 final 적용
    //1.선언시 초기화후 수정불가
    final String bank = "우리은행";
    final String bank2;
    final String bank3;

    //3.instance block에서 초기화후 수정불가
    {
        bank3 = "신한은행";
    }

    //static final(상수)
    static final String LOCATION = "홍대입구";
    static final String LOCATION2;

    static {
        LOCATION2 = "신촌";
    }

    public static int getCnt() {
        return cnt;
    }

    public Account(String accNo, int balance) {
        //super(); 자식이 생성되면 부모가 자동으로 생성됨
        this.accNo = accNo;
        this.balance = balance;
        cnt++;
        print(accNo + " 계좌가 개설되었습니다.");
        //2. 생성시 초기화후 수정불가
        bank2 = "신한은행";
    }

    public void deposit(int amount) {
        balance += amount;
        print(amount + "원이 입금되었습니다.");
    }

    public void withdraw(int amount) {
        balance -= amount;
        print(amount + "원이 출금되었습니다.");
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void print(String msg) {
        System.out.println(accNo + " 계좌에 " + msg);
        System.out.println(accNo + " 계좌의 잔고는" + balance + "원입니다.");
        System.out.println();
    }
}