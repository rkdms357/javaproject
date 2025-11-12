package com.shinhan.day14;

import java.util.*;
import java.util.function.*;

import com.shinhan.day14.q16.Student;

public class StreamTest {
    static List<Student> studentList = List.of(
            new Student("홍길동1", 100, 90),
            new Student("홍길동2", 90, 88),
            new Student("홍길동3", 80, 100)
    );

    public static void main(String[] args) {
        f9();
    }

    private static void f9() {
        //학생들의 영어점수의 합계
        int total = studentList.stream()
                .mapToInt(s -> s.getEnglishScore())
                .sum();
        System.out.println(total);

        //reduce는 2개를 가지고 연산, 1개가 남으면 종료
        int total2 = studentList.stream()
                .mapToInt(s -> s.getEnglishScore())
                .reduce(0, (a, b) -> a + b);
        System.out.println(total2);
    }

    private static void f8() {
        int[] arr = {1, 2, 3, 4};
        OptionalDouble opDouble = Arrays.stream(arr)
                .average();

        Double result = Arrays.stream(arr)
                .average().getAsDouble(); //배열에 값이 없으면 문제있는코드..

        //있을때
        opDouble.ifPresent(a -> System.out.println(a));
        //있을때, 없을때
        opDouble.ifPresentOrElse(
                a -> System.out.println(a),
                () -> {
                    System.out.println("값 없음");
                });
        //없을때 초기값
        result = opDouble.orElse(0);
        System.out.println(result);
    }

    private static void f7() {
        int[] arr = {10, 20, 30, 1, 2, 3};
        //짝수 개수
        long result = Arrays.stream(arr)
                .filter(num -> num % 2 == 0).count();
        System.out.println("개수: " + result);

        //짝수의 합
        long result2 = Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .peek(num -> System.out.println("num: " + num))
                .sum();
        System.out.println("합계: " + result2);
    }

    private static void f6() {
        int[] arr = {10, 20, 30};
        //모든 값이 10이상인가?
        boolean result = Arrays.stream(arr)
                .allMatch(data -> data >= 10);
        System.out.println(result);

        //어느하나라도 20이상이 있나?
        boolean result2 = Arrays.stream(arr)
                .anyMatch(data -> data >= 20);
        System.out.println(result2);

        //20이상이 하나도 없나요?
        boolean result3 = Arrays.stream(arr)
                .noneMatch(data -> data >= 20);
        System.out.println(result3);
    }

    private static void f5() {
        long cnt = studentList.stream()             //original
                .peek(st -> System.out.println(st))
                .filter(st -> st.getEnglishScore() >= 90)
                .peek(st -> System.out.println("OK!!: " + st))
                .count();                                   //최종
        System.out.println(cnt);
    }

    private static void f4() {
        int[] arr = {10, 20, 30};
        double avg = Arrays.stream(arr)
                .peek(i -> System.out.println("i=" + i))
                .average()
                .orElse(0);
        System.out.println(avg);
    }

    private static void f3() {
        int[] arr = {10, 20, 30};
        // final int total = 0;
        Arrays.stream(arr)
                .forEach(i -> {
                    System.out.println(i);
                    //불가 total += i;
                });
    }

    private static void f2() {
        ToIntFunction<Student> engFunc = s -> s.getEnglishScore();
        ToIntFunction<Student> mathFunc = s -> s.getMathScore();

        System.out.println("engAvg: " + getAvg(engFunc));
        System.out.println("engAvg: " + getAvg(mathFunc));
    }

    private static double getAvg(ToIntFunction<Student> func) {
        double avg = studentList.stream()    //original stream
                .mapToInt(func)              //중간단계
                .average()                   //최종단계
                .orElse(0);                  //없으면 0, 있다면 average()값을 double로 변경
        return avg;
    }

    private static void f1() {
        Integer[] arr = {10, 20, 30, 10, 20, 30, 90};
        //for문: 외부반복자
        //Stream : 내부반복자, 데이터가 흘러가면서 중간 처리, 최종 처리

        Arrays.stream(arr)      //original Stream
                .distinct()             //중간처리..중복제거
                .filter(num -> num > 10)
                .forEach(su -> System.out.println(su));
    }
}