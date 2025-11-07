package com.shinhan.day12;

import java.util.HashSet;
import java.util.TreeSet;

import com.shinhan.day11.thread.Account;

public class CollectionTest2 {
    public static void main(String[] args) {
        f5();
    }

    private static void f5() {
        HashSet<Account> data = new HashSet<>();
        data.add(new Account("112", "A", 1000));
        data.add(new Account("999", "A", 1000));
        data.add(new Account("112", "A", 2000));
        data.add(new Account("112", "D", 1000));
        data.add(new Account("112", "E", 5000));

        for (Account acc : data) {
            System.out.println(acc);
        }
    }

    private static void f4() {
        // < : 오름차순(Ascending),
        // 0 : 같다
        // > : 내림차순(Descending)
        System.out.println("A".compareTo("B"));
    }

    private static void f3() {
        TreeSet<Book> data = new TreeSet<>();
        // add()시에 비교를 함
        data.add(new Book("Z", "김길동", 90000));
        data.add(new Book("Z", "김길동", 20000));
        data.add(new Book("Z", "김길동", 50000));
        data.add(new Book("Z", "양길동", 10000));
        data.add(new Book("F", "김길동", 10000));
        data.add(new Book("D", "김길동", 10000));
        data.add(new Book("W", "김길동", 10000));
        for (Book b : data) {
            System.out.println(b);
        }
    }

    private static void f2() {
        TreeSet<String> data = new TreeSet<>();
        data.add("A"); // 65
        data.add("C");
        data.add("B");
        data.add("D");
        data.add("a"); // 97
        data.add("9"); // 48+9=57
        System.out.println(data);
    }

    private static void f1() {
        // Set <-- HashSet : 순서 없음, 중복 불가
        // Set <-- TreeSet : add()시에 값을 비교해서 순서대로 들어감 (add늦음, 검색속도 높), 중복 불가
        TreeSet<Integer> data = new TreeSet<>();
        data.add(88);
        data.add(77);
        data.add(90);
        data.add(100);
        data.add(66);
        System.out.println(data);
        System.out.println(data.first());
        System.out.println(data.last());
        System.out.println("higher: " + data.higher(88));
        System.out.println("floor: " + data.floor(88)); // 자기 포함해서 나옴
    }
}