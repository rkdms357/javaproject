package com.shinhan.day13;

import java.io.IOException;
import java.net.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

import com.shinhan.day13.q15.Student2;

public class StreamTest {
    public static void main(String[] args) throws URISyntaxException, IOException {
        f13();
    }

    private static void f13() {
        Student2[] arr = {
                new Student2("학번11", 100),
                new Student2("학번12", 60),
                new Student2("학번13", 80),
                new Student2("학번14", 70),
                new Student2("학번15", 99),
        };
        List<Student2> dataList = Arrays.asList(arr);
        dataList.stream()
                //.sorted() //Ascending
                //.sorted((a, b) -> b.score-a.score) //Descending
                //.sorted((a, b) -> Integer.compare(b.score, a.score)) //Descending
                .sorted((a, b) -> b.id.compareTo(a.id)) //학번으로 Descending
                .forEach(st -> System.out.println(st));
    }

    private static void f12() {
        List<String> data = List.of(
                "This is JAVA",
                "I am a best developer"
        );
        data.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .forEach(s -> System.out.println(s));
    }

    private static void f11() {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("------boxed-------");
        Arrays.stream(arr)
                .boxed()
                .forEach(data -> System.out.println(data));

        System.out.println("------double------");
        Arrays.stream(arr)
                .asDoubleStream()
                .forEach(data -> System.out.println(data));
    }

    private static void f10() {
        Student2[] arr = {
                new Student2("학번11", 100),
                new Student2("학번12", 60),
                new Student2("학번13", 80),
                new Student2("학번14", 70),
                new Student2("학번15", 99),
        };
        System.out.println("학번만 추출");
        Arrays.stream(arr)
                .map(st -> st.id)
                .forEach(aa -> System.out.println(aa));

        System.out.println("점수만 추출");
        Arrays.stream(arr)
                .mapToInt(st -> st.score)
                .forEach(aa -> System.out.println(aa));
    }

    private static void f9() {
        //Student2의 점수가 80이상인 사람만 출력하기
        Student2[] arr = {
                new Student2("11", 100),
                new Student2("12", 60),
                new Student2("13", 80),
                new Student2("14", 70),
                new Student2("15", 99),
        };
        Arrays.stream(arr).filter(st -> st.score >= 80)
                .forEach(st -> System.out.println(st));
    }

    private static void f8() {
        List<String> data = new ArrayList<>();
        data.add("홍길동입니다.");
        data.add("홍길동입니다.");
        data.add("신용권");
        data.add("신용권");
        data.add("이은희임");
        data.add("이은희임");
        data.add("신은희");
        data.add("신길동");

        //이름의 길이가 3보다 큰사람, 중복없음
        data.stream() //original
                .distinct() //중복제거
                .filter(name -> name.length() > 3)
                .forEach(name -> System.out.println(name));
        System.out.println("-------시오작-------");

        //신으로 시작하는 이름만 추출
        data.stream() //original
                .distinct() //중복제거
                .filter(name -> name.startsWith("신"))
                .forEach(name -> System.out.println(name));
        System.out.println("------------------");

        data.stream()
                .distinct() //중복제거
                .forEach(name -> System.out.println(name));
    }

    //File을 stream으로 읽기
    private static void f7() throws URISyntaxException, IOException {
        URL url = StreamTest.class.getResource("data.txt");
        System.out.println(url.toURI());
        Path path = Paths.get(url.toURI());
        Files.lines(path).forEach(s -> System.out.println(s));
    }

    //IntStream 범위만큼 Stream
    private static void f6() {
        //내부반복자
        IntStream.rangeClosed(1, 10).forEach(i -> System.out.println(i));
    }

    private static void f5() {
        int[] arr = {100, 80, 44, 90};
        Arrays.stream(arr).forEach(i -> {
            System.out.println(i);
        });
    }

    private static void f4() {
        //여러명의 학생, 점수의 평균구하기 1)외부반복자 2)내부반복자

        List<Student2> data = new ArrayList<>();
        data.add(new Student2("11", 100));
        data.add(new Student2("12", 90));
        data.add(new Student2("13", 80));
        data.add(new Student2("14", 70));
        data.add(new Student2("15", 60));

//		double avg = data.stream().mapToInt(st->st.score).average().getAsDouble(); //값이 없을수도 있어서 밑에 코드처럼 체크해야함...
//		System.out.println("평균: " + avg);

        OptionalDouble optionalAvg = data.stream().mapToInt(st -> st.score).average();
        optionalAvg.ifPresentOrElse(value -> {
            System.out.println("평균: " + value);
        }, () -> {
            System.out.println("평균 계산 실패");
        });
    }

    private static void f3() {
        Set<String> data = new HashSet<>();
        data.add("홍길동");
        data.add("신용권");
        data.add("이은희");
        data.add("홍길동2");
        data.add("신용권2");
        data.add("이은희2");
        //내부반복자, 병렬처리 -> 여러개의 스레드가 나눠서 처리
        Stream<String> parallelStream = data.parallelStream();

        parallelStream.forEach(s -> {
            System.out.println(s + ":" + Thread.currentThread().getName());
        });
    }
    //

    private static void f2() {
        Set<String> data = new HashSet<>();
        data.add("홍길동");
        data.add("신용권");
        data.add("이은희");
        data.add("홍길동2");
        data.add("신용권2");
        data.add("이은희2");
        //내부반복자 -> 하나의 스레드가 내부반복자로 처리
        data.stream().forEach(s -> {
            System.out.println(s + ":" + Thread.currentThread().getName());
        });
    }

    private static void f1() {
        Set<String> data = new HashSet<>();
        data.add("홍길동");
        data.add("신용권");
        data.add("이은희");
        //외부반복자
        for (String name : data) {
            System.out.println(name);
        }
    }
}