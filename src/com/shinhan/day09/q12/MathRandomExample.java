package com.shinhan.day09.q12;

import java.util.Arrays;
import java.util.Random;

public class MathRandomExample {
    public static void main(String[] args) {
//		double a = Math.random(); //0<=  <1
//		System.out.println(a);
//
        Random random = new Random();
//		System.out.println(random.nextDouble()); //0<= <1
//		System.out.println(random.nextInt()); //Math.MIN_VALUE<=  <Integer.MAX_VALUE
//		System.out.println(random.nextInt(3)); //0<=  <3
//
//		//로또 번호 1~45 사이의 정수
        int[] result = new int[6]; //{0, 0, 0, 0, 0, 0}
        int seq = 0;
        aa:
        while (true) {
            if (seq == result.length) break;
            int su = random.nextInt(45) + 1; //1<= <=45

            for (int i = 0; i < seq; i++) {
                if (su == result[i]) {
                    continue aa;
                }
            }
            result[seq] = su;
            seq++;
        }
        System.out.println(Arrays.toString(result));
    }
}