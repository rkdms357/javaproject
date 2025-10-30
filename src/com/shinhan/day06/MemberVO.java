package com.shinhan.day06;
//VO(Value Object): 데이터저장 목적
//DTO(Data Transfer Object): 데이터를 전송 목적
//Bean(자바 객체를 의미)

/**
 * [MVC모델]
 * Model : Service, DAO
 * View : 디스플레이(사용자에게 보여줌)가 목적
 * Controller : 사용자의 요청, 응답
 * <p>
 * 1. 사용자가 Controller에게 요청을 보냄
 * 2. Controller가 서비스 호출
 * 3. 서비스는 업무로직을 수행. DB가 필요하면 DAO를 호출
 * 4. 서비스가 결과를 Controller에게 전달함
 * 5. View에게 결과를 보내서 출력
 */
public class MemberVO {
    String name;
    String id;
    String password;
    int age;

    public MemberVO(String name, String id) {
        super();
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "MemberVO [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        MemberVO user1 = new MemberVO("홍길동", "hong");
        System.out.println(user1);
    }
}