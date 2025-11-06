package com.shinhan.day11;

public class GenericTest2 {
    public static void main(String[] args) {
//		Box<Integer, String> result = f3(100, "ABC");
//		System.out.println(result);
//
//		Box<TV, String> result2 = f3(new TV("", 1), "ABC");
//		System.out.println(result2);

        Box<String, Integer> b1 = new Box<>("ABC", 100);
        Box<String, Double> b2 = new Box<>("ABC", 100.5);
        printBox(b1);
        printBox2(b2);
    }

    //return타입 제한하기
    private static Box<? extends String, ? extends Number> printBox3() {
        Box<String, Integer> b2 = new Box<>("ABC", 100);
        return b2;
    }

    //매개변수 제한하기
    private static void printBox2(Box<? extends String, ? extends Number> b1) {
        System.out.println(b1);
    }

    //box가 들어오면 출력하기
    private static <A, B> void printBox(Box<A, B> b1) {
        System.out.println(b1);
    }

    //제네릭메서드 (리턴타입 앞에 명시)
    private static <K, M> Box<K, M> f3(K kind, M model) {
        //Box를 생성해서 return
        Box<K, M> b1 = new Box<>(kind, model);
        return b1;
    }

    private static void f2() {
        HomeAgency agency = new HomeAgency();
        Home home = agency.rent();
        home.turnOnLight();
    }

    private static void f1() {
        Product<TV, String> p1 = new Product<>(new TV("삼성", 200), "TV-abc");
        System.out.println(p1);

        Product<Computer, Integer> p2 = new Product<>(new Computer("window"), 123456);
        System.out.println(p2);
    }
}