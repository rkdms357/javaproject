package com.shinhan.day12.q14;

class MovieThread extends Thread {
//	@Override
//	public void run() {
//		for(int i = 0; i<3;i++) {
//			System.out.println("동영상을 재생합니다");
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//			}
//		}
//	}

    //문제 6번
    public void run() {
        while (true) {
            System.out.println("동영상을 재생합니다.");
            if (isInterrupted()) break;
            //InterruptedException이 발생하지 않았다면 isInterrupted()메소드는 true를 리턴
        }
        System.out.println("자원을 정리.. 스레드 종료(안전 종료)");
    }
}

//2번 문제 멀티스레드에서 사용하는 공유자원에 Lock걸기 (동기화)
class ShareArea {
    public synchronized void f1() {
    } //다른스레드가 못들어옴. Lock걸기1

    public void f2() {
        synchronized (this) { //Lock걸기2

        }
    }

    public void f3() {
    }
}

class MusicRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("음악을 재생합니다");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
//		Thread t1 = new MovieThread();
//		t1.start();
//
//		Thread t2 = new Thread();
//		t2.start();

        Thread t1 = new MovieThread();
        t1.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        t1.interrupt();
        System.out.println("----main End----");
    }
}