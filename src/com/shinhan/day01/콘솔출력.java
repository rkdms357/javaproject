package com.shinhan.day01;

public class 콘솔출력 {

        public static void main(String[] args) {
            f1();
        }

    private static void f1() {
        //System.out: 표준출력(모니터)
        System.out.println("출력후 줄바꿈");
        System.out.println("----------");
        System.out.print("출력후 줄바꾸기 안함");
        System.out.println("*************");
        int score = 100;
        String myname = "진";
        System.out.printf("score = %5d 이름 = %-10s ** \n", score, myname);
        System.out.println("#############");
    }
}
