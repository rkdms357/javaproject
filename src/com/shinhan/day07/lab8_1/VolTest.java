package com.shinhan.day07.lab8_1;

public class VolTest {

    public static void main(String args[]) {

        //Volume 타입의 배열 생성 (객체 3개 저장할 수 있음)
        //Volume은 인터페이스라 객체 생성은 불가능하지만, 참조 타입으로는 사용 가능
        Volume[] v = new Volume[3];
        v[0] = new Speaker();
        v[1] = new Radio();
        v[2] = new TV();

        for (int i = 0; i < v.length; i++) {
            for (int j = 1; j <= 3; j++) {
                v[i].volumeUp(200);
            }
            for (int j = 1; j <= 3; j++) {
                v[i].volumeDown(300);
            }
        }
    }
}