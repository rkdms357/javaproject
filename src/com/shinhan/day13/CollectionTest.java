package com.shinhan.day13;

import java.util.*;

class Coin {
    int value;

    public Coin(int value) {
        super();
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Coin [value=").append(value).append("]");
        return builder.toString();
    }
}

public class CollectionTest {
    public static void main(String[] args) {
        f5();
    }

    private static void f5() {
        List<String> originalList = new ArrayList<>();
        originalList.add("월");
        originalList.add("화");
        originalList.add("토");

        String[] arr = {"토", "일"};

        List<String> data = List.of("월", "화", "토");
        List<String> data2 = List.copyOf(originalList);
        List<String> data3 = Arrays.asList(arr);
        //List.of()또는 List.copyOf 또는 Arrays.asList()로 추가하면, 추가, 삭제 불가
        //data.remove(0); Immutable해서 삭제 불가
        //data2.remove(0);
        //data3.remove(0);
        //data3.add("!!");
        for (String s : data3) {
            System.out.println(s);
        }
    }

    private static void f4() {
        List<String> data = new ArrayList<>();
        data.add("월");
        data.add("화");
        data.add("토");
        //읽기, 추가, 삭제가 가능
        data.remove(0);
        for (String s : data) {
            System.out.println(s);
        }
    }

    private static void f3() {
        // MultiThread환경에서 안정적(동기화지원) : Vector
        // ArrayList, LinkedList : 안정적이지 않음
        List<String> data = Collections.synchronizedList(new ArrayList<>());
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    data.add(getName() + "---" + i);
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    data.add(getName() + "---" + i);
                }
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("개수:" + data.size());
        System.out.println("--함수끝----");
    }

    private static void f2() {
        // FIFO
        Queue<Coin> data = new LinkedList<Coin>(); // Queue는 new못함
        data.offer(new Coin(100));
        data.offer(new Coin(200));
        data.offer(new Coin(300));
        while (!data.isEmpty()) {
            System.out.println(data.poll());
        }
    }

    private static void f1() {
        // LIFO
        Stack<Coin> data = new Stack<>();
        data.push(new Coin(100)); // add도 가능하지만 권장안함!
        data.push(new Coin(200));
        data.push(new Coin(300));
        System.out.println(data.pop());
        System.out.println("-------------");
        while (!data.isEmpty()) {
            System.out.println(data.pop());
        }
    }
}