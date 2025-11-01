package com.shinhan.day07.inter;

public class OracleDB implements JDBC {
    @Override
    public void connection() {
        System.out.println(getClass().getSimpleName() + "연결");
    }

    @Override
    public void statement() {
        System.out.println(getClass().getSimpleName() + "연결통로");
    }

    @Override
    public void execute() {
        System.out.println(getClass().getSimpleName() + "SQL실행");
    }
}