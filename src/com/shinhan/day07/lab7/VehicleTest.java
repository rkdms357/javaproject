package com.shinhan.day07.lab7;

public class VehicleTest {
    public static void main(String[] args) {

        //추상클래스는 인스턴스 생성 불가
        //Vehicle vv = new Vehicle("", 111); 컴파일 오류

        //다양한 Vehicle 자식 객체를 하나의 배열에 담음 (다형성 활용)
        Vehicle[] arr = new Vehicle[3];
        arr[0] = new Car("승용차", 180, 15);
        arr[1] = new Bus("시내버스", 100, 40);
        arr[2] = new Truck("화물트럭", 90, 5000);

        //배열의 각 차량에 대해 공통 동작 수행
        for (Vehicle obj : arr) {
            print(obj);
        }
    }

    private static void print(Vehicle obj) {
        //Vehicle의 info() 호출 → 기본 정보 + 자식의 extraInfo() 함께 출력됨
        obj.info();

        if (obj instanceof Bus b) {
            System.out.println("버스의 승객 수 " + b.passengerCount);
        } else if (obj instanceof Truck t) {
            System.out.println("트럭의 적재량 " + t.maxLoad);
        }

        //공통 메서드 호출 (모든 Vehicle이 공통으로 가짐)
        obj.start();
        obj.stop();
    }
}