package com.shinhan.day08.inner;

public class PiggyBank {

    int total;
    Slot slot = new Slot();

    //	PiggyBank() {
//		total = 0;
//		slot = new Slot();
//	}
    class Slot {
        void put(int amount) {
            total += amount;
        }
    }
}