package com.shinhan.day09;

class Dice {
    int size;

    Dice(int size) {
        this.size = size;
    }

    int play() {
        int number = (int) (Math.random() * size) + 1;
        return number;
    }
}

public class DiceGame {
    public static void main(String args[]) {
        DiceGame game = new DiceGame();
        int result1 = game.countSameEye(10);
        System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
        int result2 = game.countSameEye(-10);
        System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
    }

    int countSameEye(int n) {
        int result = 0;
        // RuntimeException > IllegalArgumentException
        // RuntimeException은 unChecked Exception. Exception처리가 필수가 아님
        // 처리 안하면 오류시 프로그램 중지
        // 중지 안하려면 try-catch
        try {
            if (n < 0)
                throw new IllegalArgumentException("던진 횟수는 음수불가");
            Dice d1 = new Dice(8);
            Dice d2 = new Dice(8);
            for (int i = 1; i <= n; i++) {
                int n1, n2;
                n1 = d1.play();
                n2 = d2.play();
                System.out.println(n1 + "----" + n2);
                if (n1 == n2) result++;
            }
        } catch (Exception e) { // 상위 Exception도 가능
            System.out.println(e.getMessage());
        }
        return result;
    }
}