package com.shinhan.day15.q17;

import java.util.*;
import java.util.stream.Collectors;

class Member2 {

    private String name;
    private String job;

    public Member2(String name, String job) {
        super();
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Member2 [name=").append(name).append(", job=").append(job).append("]");
        return builder.toString();
    }
}

public class MemberExample2 {
    public static void main(String[] args) {
        List<Member2> memberList = Arrays.asList(
                new Member2("홍1", "개발자"),
                new Member2("홍2", "디자이너"),
                new Member2("홍3", "디자이너"),
                new Member2("홍4", "개발자"),
                new Member2("홍5", "개발자")
        );
        List<Member2> developers =
                memberList.stream()
                        .filter(m -> m.getJob().equals("개발자"))  //개발자만 걸러서
                        .collect(Collectors.toList());         //수집

        developers.stream().forEach(m -> System.out.println(m.getName()));
        developers.stream().map(Member2::getName).forEach(System.out::println); //더 간결하게.

        //직업으로 Grouping
        Map<String, List<Member2>> grouping =
                memberList.stream()
                        .collect(Collectors.groupingBy(m -> m.getJob()));
        System.out.println(grouping.get("디자이너"));
        System.out.println(grouping.get("개발자"));
    }
}