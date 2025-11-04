package com.shinhan.day09.q11;

public class q4 {
    public static void main(String[] args) throws RuntimeException {
        //강제로 예외를 일으킴
        //1)throws RuntimeException
        //2)try-catch
        //try {
        throw new RuntimeException("실행예외"); //일으키면 던짐
        //} catch (RuntimeException e) {
        //	System.out.println(e.getMessage());
        //}
    }
}