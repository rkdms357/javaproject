package com.shinhan.day15.q17;

import java.util.*;

class Member {

    private String name;
    private int age;

    public Member(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class MemberExample {
    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
                new Member("홍1", 20),
                new Member("홍2", 30),
                new Member("홍3", 40),
                new Member("홍4", 50),
                new Member("홍5", 60)
        );

        //내부반복자
        double avg = memberList.stream()
                .mapToInt(m -> m.getAge())
                .average()
                .orElse(0);
        System.out.println(avg);

        //외부반복자
        double total = 0;
        for (Member member : memberList) {
            total += member.getAge();
        }
        System.out.println(total / memberList.size());
    }
}