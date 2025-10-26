package com.shinhan.day02;

import java.util.Scanner;

//sc.nextLine() → 한 줄 전체 입력. 엔터까지 포함해서 읽음
//sc.next() → 공백 전까지 입력. 이후 엔터가 버퍼에 남아있어 다음 입력에 영향 줄 수 있음
public class Banking {

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력1>>");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.print("입력2>>");
        String name2 = sc.next();
        sc.nextLine();
        System.out.println(name2);

        System.out.print("입력3>>");
        String name3 = sc.next();
        System.out.println(name3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isStop = false;
        int balance = 0;

        while (!isStop) {
            menuDisplay();
            int selectJob = sc.nextInt();
            switch (selectJob) {
                case 1:
                    System.out.print("예금액>");
                    long amount = sc.nextLong();
                    balance += amount;
                    break;
                case 2:
                    System.out.print("출금액>");
                    long amount2 = sc.nextLong();
                    balance -= amount2;
                    break;
                case 3:
                    System.out.printf("잔고>%d\n", balance);
                    break;
                case 4:
                    isStop = true;
            }
        }
        sc.close();
        System.out.println("프로그램 종료");
    }

    private static void menuDisplay() {
        System.out.println("===========================");
        System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
        System.out.println("===========================");
        System.out.print("선택>>");
    }
}
