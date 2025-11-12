package com.shinhan.day14.q16;

//람다표현가능
@FunctionalInterface
interface MyOperator {
    public int apply(int x, int y);
}

public class OperatorExample {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(MyOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(score, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(new MyOperator() {
            @Override
            public int apply(int x, int y) {
                return Math.max(x, y);
            }
        });
        System.out.println("최대값: " + max);
        int max2 = maxOrMin((x, y) -> Math.max(x, y));
        System.out.println("최대값: " + max2);

        int max3 = maxOrMin(Math::max);
        System.out.println("최대값: " + max3);

        int min = maxOrMin(Math::min);
        System.out.println("최소값: " + min);
    }
}