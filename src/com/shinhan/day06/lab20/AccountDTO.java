package com.shinhan.day06.lab20;
//DTO(Data Transfer Object): 데이터를 전송 목적

/**
 * [MVC모델]
 * Model : Service, DAO
 * View : 디스플레이(사용자에게 보여줌)가 목적
 * Controller : 사용자의 요청, 응답
 * <p>
 * 1. 사용자가 Controller에게 요청을 보냄
 * 2. Controller가 서비스 호출
 * 3. 서비스는 업무로직을 수행. DB가 필요하면 DAO를 호출
 * 4. 서비스가 결과를 Controller에게 전달함
 * 5. View에게 결과를 보내서 출력
 */
public class AccountDTO {

    private String accNo;
    private String owner;
    private int balance;

    //생성자를 정의하면 컴파일시에 기본생성자를 만들지 않음......
    //생성자를 정의 안하면 컴파일시에 기본생성자를 만듦
    public AccountDTO(String accNo, String owner, int balance) {
        super();
        this.accNo = accNo;
        this.owner = owner;
        this.balance = balance;
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
        return owner
                + "님\n"
                + "계좌번호: "
                + accNo
                + ", 잔고는 "
                + balance
                + "원 입니다.";
    }
}