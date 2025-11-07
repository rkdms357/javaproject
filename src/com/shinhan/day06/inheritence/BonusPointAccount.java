package com.shinhan.day06.inheritence;

public class BonusPointAccount extends Account {
    public int bonusPoint;

    public BonusPointAccount(String accNo, String owner, int balance, int bonusPoint) {
        super(accNo, owner, balance);
        this.bonusPoint = bonusPoint;
    }

    @Override
    public void deposite(int amount) { //변수 이름은 달라도 됨. 접근지정자는 더 넓어야됨
        super.deposite(amount);
        bonusPoint += (int) (amount * 0.001);
    }

    @Override
    public String toString() {
        String msg = super.toString();
        return msg + "BonusPointAccount [bonusPoint=" + bonusPoint + "]";
    }

}