package com.shinhan.day11.thread;
//@EqualsAndHashCode(of= {"accNo","owner"})

import java.util.Objects;

//DTO: 데이터 전송이 목적
//final class: 상속 받은 하위 class 만들기 불가
//final field: 값 변경 불가능
//final method: 재정의 불가능
public class Account implements Comparable<Account> {
    // private 때문에 자식이라도 접근 불가
    private String accNo;
    private String owner;
    private int balance;

    public Account() {
        // super(); 부모의 생성자를 호출 Object() 수행
        System.out.println("public Account 생성자");
    }

    // 생성자를 정의하면 컴파일시에 기본 생성자를 만들지 않음
    public Account(String accNo, String owner, int balance) {
        super();
        this.accNo = accNo;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
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

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "계좌번호 =" + accNo + ", 계정주=" + owner + ", 잔고=" + balance;
    }

    // 동일객체인지? HashSet에서 사용됨
    @Override
    public int hashCode() {
        return Objects.hash(accNo, owner);
        // return Objects.hash(accNo, balance, owner);
    }

    // 동일객체인지? HashSet에서 사용됨
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        return Objects.equals(accNo, other.accNo) && Objects.equals(owner, other.owner);
        // return Objects.equals(accNo, other.accNo) && balance == other.balance &&
        // Objects.equals(owner, other.owner);
    }

    @Override
    public int compareTo(Account obj) {
        // 잔고가 많은순으로 정렬 (descending)
        // 잔고가 같으면 이름순으로 Ascending
        // 잔고와 이름이 같으면 계좌번호 Ascending
        int resultBalance = obj.balance - balance;
        int resultOwner = owner.compareTo(obj.owner);
        if (resultBalance == 0 && resultOwner == 0)
            return accNo.compareTo(obj.accNo);
        if (resultBalance == 0)
            return owner.compareTo(obj.owner);
        return resultBalance;
    }
}