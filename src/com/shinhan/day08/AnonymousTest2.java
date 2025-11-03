package com.shinhan.day08;

public class AnonymousTest2 {
    static Tire tire2 = new Tire() { //익명객체 필드로 사용
        void Tire() {
        } //함수는 가능
        //Tire(){} 생성자는 가질수 없음

        @Override
        public void roll() {
            // TODO Auto-generated method stub

        }
    };

    public static void main(String[] args) {
        Tire tire3 = new Tire() {
            @Override
            public void roll() {
                // TODO Auto-generated method stub

            }
        };
        tire3.roll();
    }

    public static void main2(String[] args) {
        tire2.roll();

    }

    public static void f1(String[] args) {
        work(new Tire() { //익명객체 매개변수로 사용
            @Override
            public void roll() {
                // TODO Auto-generated method stub

            }
        });
    }

    private static void work(Tire tire) {
        tire.roll();
    }
}