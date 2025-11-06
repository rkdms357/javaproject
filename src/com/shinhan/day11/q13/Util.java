package com.shinhan.day11.q13;

public class Util {
//	static <K, V> V getValue(Pair<K, V> pair, K key) {
//		if (pair.getKey().equals(key)) {
//			return pair.getValue();
//		}
//		return null;
//	}

    static <P extends Pair<K, V>, K, V> V getValue(P pair, K key) {
        if (pair.getKey().equals(key)) {
            return pair.getValue();
        }
        return null;
    }
}