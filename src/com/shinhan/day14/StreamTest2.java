package com.shinhan.day14;

import java.util.*;
import java.util.stream.*;

public class StreamTest2 {
    static List<HighStudent> totalList = List.of(
            new HighStudent("홍1", "남", 92),
            new HighStudent("홍2", "여", 96),
            new HighStudent("홍3", "여", 82),
            new HighStudent("홍4", "남", 99),
            new HighStudent("홍5", "남", 100)
    );

    public static void main(String[] args) {
        f5();
    }

    private static void f5() {
        List<Integer> scoreList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 1; i <= 100000000; i++) {
            scoreList.add(random.nextInt(101));
        }
        //scoreList 값들의 평균 구하기
        //1)일반 Stream
        compute(scoreList);
        //2)병렬 Stream
        compute2(scoreList);
    }

    private static void compute2(List<Integer> scoreList) {
        //1)병렬 Stream
        long start = System.nanoTime();
        double d = scoreList.parallelStream()
                .mapToInt(obj -> obj.intValue())
                .average()
                .orElse(0);
        System.out.println(d);
        long end = System.nanoTime();
        System.out.println("병렬 Stream 걸린시간: " + (end - start));
    }

    private static void compute(List<Integer> scoreList) {
        //1)일반 Stream
        long start = System.nanoTime();
        double d = scoreList.stream()
                .mapToInt(obj -> obj.intValue())
                .average()
                .orElse(0);
        System.out.println(d);
        long end = System.nanoTime();
        System.out.println("일반 Stream 걸린시간: " + (end - start));
    }

    private static void f4() {
        Map<String, List<HighStudent>> genderMap = totalList.stream()
                .collect(Collectors.groupingBy(st -> st.getSex()));
        System.out.println(genderMap);
        System.out.println(genderMap.get("남"));
        System.out.println(genderMap.get("여"));

        Map<String, Double> avgMap = totalList.stream()
                .collect(Collectors.groupingBy(
                        st -> st.getSex(), Collectors.averagingDouble(st -> st.getScore())
                ));
        System.out.println(avgMap);
    }

    private static void f3() {
        //남자만 추출해서 Map으로 수집하기 (키는 이름, 값은 점수)
        //{"홍1":92, ....}
        Map<String, Integer> resultMap = totalList.stream()
                .filter(st -> st.getSex().equals("남"))
                .collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
        System.out.println(resultMap);
        for (String key : resultMap.keySet()) {
            System.out.println(key + "====" + resultMap.get(key));
        }
    }

    private static void f2() {
        //남자만 추출하기
        List<HighStudent> resultList = totalList.stream()
                .filter(st -> st.getSex().equals("남"))
                .toList();
        System.out.println(resultList.size() + "건");

        //직접 Collector 정의
        //supplier() -> 결과 컨테이너 생성
        //accumulator() -> 요소를 컨테이너에 누적
        //combiner() -> 병렬 스트림에서 컨테이너 병합
        //finisher() -> 최종 결과 반환'
        Collector<String, StringBuilder, String>
                myCollector = Collector.of(StringBuilder::new,
                (sb, s) -> sb.append(s).append("!!!"),
                StringBuilder::append,
                sb -> sb.substring(0, sb.length()) + "끝");

        String[] arr = {"하나", "둘", "셋"};
        String result = Arrays.stream(arr)
                .collect(myCollector);
        System.out.println(result);
    }

    private static void f1() {
        //남자만 추출하기
        long cnt = totalList.stream()
                .filter(st -> st.getSex().equals("남"))
                .peek(st -> System.out.println(st))
                .count();
        System.out.println(cnt + "명");
    }
}