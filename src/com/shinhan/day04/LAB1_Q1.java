package com.shinhan.day04;

import java.util.Arrays;

public class LAB1_Q1 {

    public static void main(String[] args) {
        int[] arr = {3, 24, 1, 55, 17, 43, 5};
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[j] < arr[i]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
                continue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}