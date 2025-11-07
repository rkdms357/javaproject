package com.shinhan.day12;

import java.util.Arrays;
import java.util.Comparator;

import com.shinhan.day11.thread.Account;

class Computer implements Comparable<Computer> {
    String model;
    int price;

    public Computer(String model, int price) {
        super();
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Computer [model=").append(model).append(", price=").append(price).append("]");
        return builder.toString();
    }

    @Override
    public int compareTo(Computer obj) {
        int result = price - obj.price;
        if (result == 0) return obj.model.compareTo(model);
        return result;
    }
}

//int배열을 sort --> Ascending
//Descending하고자 함
//Comparator 인터페이스를 구현
class DescendingInteger implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        return o2 - o1; //descending
    }
}

public class SortTest {
    public static void main(String[] args) {
        f5();
    }

    private static void f5() {
        Computer[] arr = {
                new Computer("B", 100),
                new Computer("A", 300),
                new Computer("A", 400),
                new Computer("A", 200),
                new Computer("A", 100),
        };
        Arrays.sort(arr, new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                return o2.price - o1.price;
            }
        });
        for (Computer cc : arr) {
            System.out.println(cc);
        }
    }

    private static void f4() {
        //Computer의 sort기준이 정해진 기준의 sort가 아니고 새로운 기준을 부여하기
        Integer[] arr = {100, 50, 70, 30, 80};
        System.out.println("before:" + Arrays.toString(arr));
        Arrays.sort(arr, new DescendingInteger());
        System.out.println("after:" + Arrays.toString(arr));
    }

    private static void f3() {
        Computer[] arr = {
                new Computer("B", 100),
                new Computer("A", 300),
                new Computer("A", 400),
                new Computer("A", 200),
                new Computer("A", 100),
        };
        Arrays.sort(arr);
        for (Computer cc : arr) {
            System.out.println(cc);
        }
    }

    private static void f2() {
        Account[] arr = {
                new Account("1", "김", 100),
                new Account("2", "박", 100),
                new Account("1", "김", 200),
                new Account("1", "김", 300),
                new Account("1", "김", 400),};
        print("before", arr);
        Arrays.sort(arr);
        print("after", arr);
    }

    private static void print(String title, Account[] arr) {
        System.out.println(title);
        for (Account acc : arr) {
            System.out.println(acc);
        }
    }

    private static void f1() {
        int[] arr = {100, 50, 70, 30, 80};
        System.out.println("before:" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("after:" + Arrays.toString(arr));
    }
}

