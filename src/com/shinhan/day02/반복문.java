package com.shinhan.day02;

import java.util.Scanner;

public class 반복문 {
    public static void main(String[] args) {
//		f1();
//		f2();
//		f3();
//		f4();
//		f5();
//		f6();
//		f7();
//		f8();
        //ch4_3();
        //ch4_4();
        //ch4_5();
        ch4_6();
    }
    private static void ch4_6() {
        for(int row = 1; row<=5; row++) {
            for(int col = 1; col<=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row = 1; row<=5; row++) {
            for(int col = 1; col<=6-row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void ch4_5() {
        //4x+5y=60 x,y는 10이하 자연수
        for(int x = 0; x<=10; x++) {
            for(int y = 0; y<=10; y++) {
                if(4*x+5*y==60) {
                    System.out.printf("(%d, %d)", x, y);
                }
            }
        }

		/*for(int x = 0; x<=10; x++) {
			int remain = 60 - (4*x);
			if(remain < 0) break;
			if(remain % 5 == 0) {
				int y = remain /5;
				if(y<=10) {
					System.out.printf("(%d, %d)", x, y);
				}
			}
		}*/

    }
    private static void ch4_4() {
        while(true) {
            int a = (int)(Math.random()*6+1);
            int b = (int)(Math.random()*6+1);
            System.out.printf("(%d, %d)\n", a, b);
            if(a+b==5) break;
        }
    }
    private static void ch4_3() {
        int sum = 0;
        for(int i = 1; i<=100; i++) {
            if(i%3==0) sum += i;
        }System.out.println(sum);
    }
    private static void f8() {
        String grade = "B";
        int score1 = 0;
        switch (grade) {
            case "A"-> score1 = 100;
            case "B" -> {
                int result = 100 - 20;
                score1 = result;
            }
            default -> score1 = 60;
        }
        System.out.println(score1);
    }
    private static void f7() {
        String grade = "B";
        int score1 = 0;
        score1 = switch (grade) {
            case "A"-> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println(score1);
    }
    private static void f6() {
        // 사용자와 대화하는 CLI 프로그램 작성하기
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int speed = 0;
        aa: while (run) {
            System.out.println("==============================");
            System.out.println("1.증속 2.감속 3.중지");
            System.out.println("==============================");
            System.out.print("선택>>");
            int selectJob = sc.nextInt();
            switch (selectJob) {
                case 1 -> {
                    speed++;
                    System.out.println("증가함. 현재속도는 " + speed);
                }
                case 2 -> {
                    speed--;
                    System.out.println("감소함. 현재속도는 " + speed);
                }
                case 3 -> {
                    // run = false;
                    break aa;
                }
            }
        }
        System.out.println("-------------end--------------");
        sc.close();
    }
    private static void f5() {
        // 9단을 출력
        int dan; // 2단부터 9단까지 1씩 증가
        int gop; // 1부터 9까지 1씩 증가
        aa: for (gop = 1; gop <= 9; gop++) {
            for (dan = 2; dan <= 9; dan++) {
                // if(dan==4) break; //가장 가까운 반복문 빠져나감. 4단 이후가 제외됨
                if (dan == 4)
                    continue; // 가장 가까운 반복문을 계속함. 단, 아래문장은 무시
                // if(dan==4) break aa;
                // if(dan==4) continue aa;
                System.out.printf("%-2d x %2d = %2d  ", dan, gop, dan * gop);
            }
            System.out.print('\n');
        }
        System.out.println("------end------");
    }
    private static void f4() {
        // 9단을 출력
        int dan; // 2단부터 9단까지 1씩 증가
        int gop; // 1부터 9까지 1씩 증가
        for (dan = 2; dan <= 9; dan++) {
            for (gop = 1; gop <= 9; gop++) {
                System.out.printf("%d x %d = %d\n", dan, gop, dan * gop);
                if (gop == 7)
                    break; // break는 가장 가까운 반복으로 빠져나감
            }
        }
        System.out.println("------end------");
    }
    private static void f3() {
        int total = 0;
        int i = 1;
        do { // 1부터 10까지 1씩 증가함
            System.out.println("반복=" + i);
            total += i;
            i++;
        } while (i <= 10);
        System.out.println("total=" + total);
        System.out.println("for수행후 i=" + i);
    }
    private static void f2() {
        int total = 0;
        int i = 1;
        while (i <= 10) { // 1부터 10까지 1씩 증가함
            System.out.println("반복=" + i);
            total += i;
            i++;
        }
        System.out.println("total=" + total);
        System.out.println("for수행후 i=" + i);
    }
    private static void f1() {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        int total = 0;
        int i;
        for (i = 1; i <= 10; i++) { // 1부터 10까지 1씩 증가함
            System.out.println("반복=" + i);
            // i++;
            // if(i>10) break;
            total += i;
        }
        System.out.println("total=" + total);
        System.out.println("for수행후 i=" + i);
    }
}