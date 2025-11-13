package com.shinhan.day15;

import java.util.List;
import java.util.function.*;

import com.shinhan.day14.HighStudent;

class MyPredicate implements Predicate<HighStudent> {
    @Override
    public boolean test(HighStudent t) {
        // TODO Auto-generated method stub
        return false;
    }
}

public class Review {
    static List<HighStudent> totalList = List.of(
            new HighStudent("홍길동1", "남", 92),
            new HighStudent("홍길동2", "여", 96),
            new HighStudent("홍길동3", "여", 82),
            new HighStudent("홍길동4", "남", 99),
            new HighStudent("홍길동5", "남", 100)
    );

    public static void main(String[] args) {
        //stream : data가 흘러가면서 처리가능, 내부반복자(속도높), 병렬처리
        //original stream, 중간처리, 최종처리

        //Predicate를 익명구현클래스로 하지 않고
        Predicate<HighStudent> pre2 = student -> student.getSex().equals("남");
        ToIntFunction<HighStudent> mapScore = st -> st.getScore();
        //IntConsumer score = jumsu->System.out.println("점수" + jumsu);
        IntConsumer score = System.out::println;

        int result = totalList.stream() //original stream
                .filter(pre2)                   //중간처리
                .mapToInt(mapScore)             //중간처리
                .peek(null)                     //중간, 루핑(리턴있음)
                .sum();                         //최종처리
        System.out.println("sum" + result);
    }
}