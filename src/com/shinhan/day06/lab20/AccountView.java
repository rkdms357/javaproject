package com.shinhan.day06.lab20;
//View(보여주기) : JSP만들예정 (HTML포함)

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
public class AccountView {

    public static void inputMsg(String msg) {
        System.out.print(msg);
    }

    public static void selectMsg(String msg) {
        System.out.println("----------");
        System.out.println(msg);
        System.out.println("----------");
    }

    public static void menuDisplay() {
        System.out.println("----------------------------------");
        System.out.println("1.계좌생성 2.계좌목록 3.입금 4.출금 5.종료");
        System.out.println("-----------------------------------");
        System.out.print("작업 선택>> ");
    }

    public static void print(String msg) {
        System.out.println("[알림]" + msg);
    }

    public static void print(AccountDTO acc) {
        System.out.println("=======계좌 정보=======");
        System.out.println(acc);
    }

    public static void print(AccountDTO[] accArr) {
        System.out.println("=======계좌 목록=======");
        for (AccountDTO acc : accArr) {
            if (acc == null) continue;
            System.out.println(acc);
        }
    }
}