package com.shinhan.day10;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.NonNull;
//import lombok.RequiredArgsConstructor;

//@NoArgsConstructor final이 있다면 불가
//@AllArgsConstructor
//@Data //default생성자, getter/setter, toString, equals
//@RequiredArgsConstructor
public class Member {
    //final 변수는 반드시 초기화해야함. 선언시나 생성시에 초기화해야함. null로도 초기화 가능
    //final String id; //id필수.
    //@NonNull String name; //name필수. null불가
    int age;
}