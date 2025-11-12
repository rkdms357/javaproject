package com.shinhan.day14.q16;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

@FunctionalInterface
interface Function {
    double apply(double x, double y);
}

class Example2 {
    public static double calc(Function fun) {
        //public static double calc(BinaryOperator<Double> fun) {
        //public static double calc(BiFunction<Double, Double, Double> fun) {
        double x = 10;
        double y = 4;
        return fun.apply(x, y);
    }
}

public class FunctionExample {
    public static void main(String[] args) {
        double result = Example2.calc((x, y) -> (x / y));
        System.out.println("result: " + result);
    }
}