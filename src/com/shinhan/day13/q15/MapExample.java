package com.shinhan.day13.q15;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hone", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int score = entry.getValue();
            totalScore += entry.getValue();
            if (maxScore > entry.getValue()) {
                maxScore = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println(name);
        System.out.println(maxScore);
        System.out.println(totalScore);
    }
}