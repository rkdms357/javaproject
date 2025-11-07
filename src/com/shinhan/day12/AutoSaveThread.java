package com.shinhan.day12;

public class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용 저장");
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
        System.out.println("----자원 저장----");
        System.out.println("----thread End----");
    }
}