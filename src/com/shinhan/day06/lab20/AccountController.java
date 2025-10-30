package com.shinhan.day06.lab20;

import java.util.Scanner;

//Controller : 사용자 요청을 받아서 서비스를 사용
//서비스가 응답하면 받아서 View에 보냄
//Servlet(서버에서 실행되는 자바 프로그램)
public class AccountController {
    private static AccountService service = new AccountService();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isContinue = true;
        while (isContinue) {
            AccountView.menuDisplay();
            int selectJob = sc.nextInt();
            switch (selectJob) {
                case 1 -> {
                    f_create();
                }
                case 2 -> {
                    f_selectAll();
                }
                case 3 -> {
                    f_deposit();
                }
                case 4 -> {
                    f_withdraw();
                }
                case 5 -> {
                    isContinue = false;
                }
                default -> {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            }
        }
        AccountView.selectMsg("프로그램 종료");
    }

    private static void f_withdraw() {
        AccountView.selectMsg("출금");
        AccountView.inputMsg("계좌번호>> ");
        String accNo = sc.next();
        AccountView.inputMsg("출금액>> ");
        int amount = sc.nextInt();
        String result = service.withdraw(accNo, amount);
        AccountView.print(result);
    }

    private static void f_deposit() {
        AccountView.selectMsg("입금");
        AccountView.inputMsg("계좌번호>> ");
        String accNo = sc.next();
        AccountView.inputMsg("입금액>> ");
        int amount = sc.nextInt();
        String result = service.deposit(accNo, amount);
        AccountView.print(result);
    }

    private static void f_selectAll() {
        AccountDTO[] accList = service.selectAllService();
        AccountView.print(accList);
    }

    private static void f_create() {
        AccountView.selectMsg("계좌생성");
        AccountView.inputMsg("계좌번호>> ");
        String accNo = sc.next();
        AccountView.inputMsg("예금주>> ");
        String owner = sc.next();
        AccountView.inputMsg("잔고>> ");
        int balance = sc.nextInt();
        AccountDTO acc = new AccountDTO(accNo, owner, balance);
        String result = service.insertService(acc);
        AccountView.print(result);
    }
}