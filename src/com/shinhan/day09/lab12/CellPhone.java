package com.shinhan.day09.lab12;

//import lombok.EqualsAndHashCode;
//@EqualsAndHashCode(of = {"model"})
//@EqualsAndHashCode(exclude = {"battery"}) 이것만 빼고
public class CellPhone {

    String model;
    double battery;

    CellPhone(String model) {
        this.model = model;
    }

    void call(int time) {
        if (time < 0) throw new IllegalArgumentException("통화시간입력오류");
        battery -= time * 0.5;
        if (battery < 0) battery = 0;
        System.out.println("통화 시간: " + time + "분");
    }

    void charge(int time) {
        if (time < 0) throw new IllegalArgumentException("충전시간입력오류");
        battery += time * 3;
        if (battery > 100) battery = 100;
        System.out.println("충전 시간: " + time + "분");
    }

    void printBattery() {
        System.out.println("남은 배터리양: " + battery);
    }

    public boolean equals(Object otherObject) {
        CellPhone cellPhone = (CellPhone) otherObject;
        return model.equals(cellPhone.model);
    }
}