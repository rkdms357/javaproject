package com.shinhan.day04;

public class LAB1_Q2_ArrayTest {
    public static void main(String[] args) {
        int[][] a = {{30, 30, 30, 30}, {40, 40, 40, 40}, {50, 50, 50, 50}};
        int[][] b = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] c = new int[3][4];
        sub(a, b, c);
        prn(a);
        prn(b);
        prn(c);
    }

    private static void prn(int[][] c) {
        System.out.println("---------------------------------");
        for (int[] arr1 : c) {
            for (int data : arr1) {
                System.out.printf("%d ", data);
            }
            System.out.println();
        }
    }

    private static int[][] sub(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }
}