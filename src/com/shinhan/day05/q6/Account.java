package com.shinhan.day05.q6;

public class Account {

    private int balance;

    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        if(amount < MIN_BALANCE || amount > MAX_BALANCE) {
            return;
        } balance = amount;
    }
}
