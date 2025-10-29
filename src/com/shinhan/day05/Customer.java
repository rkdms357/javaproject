package com.shinhan.day05;

import java.time.LocalDate;
import java.util.Date;

//class : Object를 만들기 위한 틀(템플릿, 설계도), 필드(데이터 저장) + 메서드
//Object : class를 이용해서 만든 실체(인스턴스)
public class Customer {
    //고객(고객번호, 이름, 전화번호, 생일, 등록일, level(gold, silver, bronze))
    //1. 필드(instance변수==멤버변수, static변수==클래스변수)
    String custNo;
    String custName;
    String phoneNumber;
    LocalDate birthday;
    Date regDate;
    CustomerLevel level;

    private static int custCnt; //static안하면 독립적으로 1개만 증가함, 외부에서 접근 못하도록 private

    //2. 생성자(constructor)
    //정의하지 않으면 컴파일시에 default생성자를 만듦
//	Customer(){
//		this(null, null, null, null, null);
//	} //정보가 없으니 고객생성안함~
    //매개변수 이름과 필드 이름이 충돌~ 구분해야하므로
    //현재객체를 나타내는 this.를 사용~
    //생성자의 오버로딩: 이름같고 매개변수 타입, 개수가 다른 생성자를 여러개
    //생성자가 다른 모양의 생성자를 호출시 this()를 사용
    Customer(String custNo, String custName, String phoneNumber) {
        this(custNo, custName, phoneNumber, null, CustomerLevel.BRONZE);
    }

    Customer(String custNo, String custName,
             String phoneNumber, LocalDate birthday, CustomerLevel level) {
        this.custNo = custNo;
        this.custName = custName;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.regDate = new Date();
        this.level = level;
        custCnt++;
    }

    //3. 메서드 : 고객 정보 출력, 고객수 출력
    void custInfoPrint() {
        System.out.println("======고객 정보======");
        System.out.println("번호: " + custName);
        System.out.println("이름: " + custNo);
        System.out.println("전화번호: " + phoneNumber);
        System.out.println("레벨: " + level);
        System.out.println("생일: " + birthday);
        System.out.println("등록: " + regDate);
    }

    //static 메서드는 객체생성 없이 사용가능
    static int getCustomerCnt() {

        return custCnt;
    }

    //4. instance block
    {
        System.out.println("instance block...객체 생성시 마다 수행");
    }

    //5. static block
    static {
        System.out.println("static block...class load시 1회 수행");
    }
}