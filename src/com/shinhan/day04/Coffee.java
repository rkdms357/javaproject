package com.shinhan.day04;

//public :모든 패키지에서 접근 가능
//private : 해당 class 내에서만 접근 가능
public class Coffee {

    //1.필드(멤버변수-instance변수, class변수-static변수)
    private String menuName;
    private int price;
    private boolean isTakeOut;

    //class변수-static변수
    static int cnt;

    //static method
    static void printCnt() {
        System.out.println("*********");
        System.out.println("개수: " + cnt);
    }

    Coffee(String menuName, int price) {
        this(menuName, price, false);
    }

    Coffee(String menuName, int price, boolean isTakeOut) {
        this.menuName = menuName;
        this.price = price;
        this.isTakeOut = isTakeOut;
        cnt++;
    }

    void print() {
        System.out.println("메뉴이름: " + menuName);
        System.out.println("가격: " + price);
        System.out.println("테이크아웃: " + isTakeOut);
    }
}