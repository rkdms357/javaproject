package com.shinhan.day12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest {
    // 스레드풀 : 작업 처리에 사용되는 스레드 개수를 제한하고
    // 작업 큐에 들어오는 작업들을 스레드가 하나씩 맡아 처리하는 방식
    // 631번예제
    public static void main(String[] args) {
        String[][] arr = new String[1000][3]; // 보내는 사람, 받는 사람, 내용
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = "admin@shinhan.com";
            arr[i][1] = "customer" + i + ".daum.net";
            arr[i][2] = "신상품입고";
        }
        //send(arr);
        send2(arr);
    }

    private static void send2(String[][] arr) {
        ExecutorService eService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < arr.length; i++) {
            int idx = i;
            Future<String> future = eService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    String result = Thread.currentThread().getName() + ": 보내는 사람->"
                            + arr[idx][0] + ": 받는 사람->"
                            + arr[idx][1] + ": 내용->"
                            + arr[idx][2];
                    return result;
                }
            });
            try {
                String msg = future.get();
                System.out.println(msg);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        eService.shutdown();
    }

    //보내는 작업
    private static void send(String[][] arr) {
        ExecutorService eService = Executors.newFixedThreadPool(5);
        //ExecutorService eService = Executors.newCachedThreadPool();
        String aa = "local변수"; //내부 클래스 사용하면 final
        for (int i = 0; i < arr.length; i++) {
            int idx = i; //i는 바뀌기 때문에 사용을 못하지만 idx는 바뀌지 않아서 사용가능. 초기화만 하기 때문에
            eService.execute(new Runnable() {

                @Override
                public void run() {
                    //System.out.println("익명구현클래스(Local Inner Class)");
                    //System.out.println(aa);
                    System.out.println(Thread.currentThread().getName() + ": 보내는 사람->"
                            + arr[idx][0] + ": 받는 사람->"
                            + arr[idx][1] + ": 내용->"
                            + arr[idx][2]);
                }
            });
        }
        eService.shutdown();
    }

    public static void main4() {
        ExecutorService eService = Executors.newFixedThreadPool(5); // 스레드를 5개씩 제한함
        for (int i = 1; i <= 100; i++) {
            eService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "스레드");
                }
            });
        }
        eService.shutdown();
    }

    public static void main3() {
        int coreCnt = Runtime.getRuntime().availableProcessors(); // 내컴퓨터의 코어 수
        System.out.println(coreCnt);
    }

    public static void main2() {
        AutoSaveThread t1 = new AutoSaveThread();
        t1.setDaemon(true); // main이 끝나면 같이 끝남
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main 종료");
    }
}