package com.shinhan.day06.inheritence;

public class CreditLineAccount extends Account {
    //컴파일시에 자동으로 넣어줘서 부모클래스에 기본 생성자를 만들어줘야함
//	public CreditLineAccount() {
//		super();
//	}
//아니면 부모클래스에 있는 생성자를 보고 명시적으로 값을 넣어줘야함
//	public CreditLineAccount() {
//	super(null, null, 0);
//}
    int creditLine;

    public CreditLineAccount(String accNo, String owener, int balance, int creditLine) {
        // 1. 부모에게 default생성자를 정의
        // 2. 자식이 명시적으로 부모의 생성자 호출
        super(accNo, owener, balance);
        this.creditLine = creditLine;
    }

    // 부모에게 물려받은 함수를 재정의
    // 함수명, 매개변수 사양, 리턴타입 모두 같아야함
    // modifier는 같거나 더 넓어져야함!!
    @Override
    public int withdraw(int amount) {
        if (getBalance() + creditLine >= amount) {
            setBalance(getBalance() - amount);
            return amount;
        } else {
            return 0;
        }
    }
}