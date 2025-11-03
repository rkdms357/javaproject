package com.shinhan.day08.inner;

public class PiggyBankTest {
    public static void main(String[] args) {
        PiggyBank bank = new PiggyBank();
        bank.slot.put(100);
        bank.slot.put(100);
        bank.slot.put(100);
        System.out.println(bank.total);
    }
}