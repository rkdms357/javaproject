package com.shinhan.day02.lab4_1;

public class Q4_StringUtil {

    public static void main(String[] args) {
        hokeyGraphics('*', 3, true);
        hokeyGraphics('&', 3, false);
    }

    private static void hokeyGraphics(char cell, int size, boolean isRect) {
        for (int i = 0; i < size; i++) {
            int end = isRect ? size : i + 1;
            for (int j = 0; j < end; j++) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    /*
    public static void main(String[] args) {
        hokeyGraphics('*', 3, true);
        hokeyGraphics('&', 3, false);
    }

    private static void hokeyGraphics(char cell, int size, boolean isRect) {
        if (isRect) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(cell);
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(cell);
                }
                System.out.println();
            }
        }
    }
     */
}
