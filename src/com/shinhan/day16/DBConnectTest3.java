package com.shinhan.day16;

import java.sql.*;
import java.util.Scanner;

import com.shinhan.util.DBUtil;

public class DBConnectTest3 {
    // 급여가 얼마이상인 직원
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = DBUtil.dbconnect();
        PreparedStatement st = null; //Statement는 ?를 지원안함
        ResultSet rs = null;
        System.out.print("급여(이상)>> ");
        int salary = sc.nextInt();
        String sql = """
                select employee_id, first_name, hire_date, salary, commission_pct
                from employees
                where salary >= ?
                """;
        try {
            st = conn.prepareStatement(sql); //미리 sql을 알려줌
            st.setInt(1, salary); //물음표한개라 첫번째 물음표에 넣으라는 뜻
            rs = st.executeQuery(); //실행
            while (rs.next()) {
                int empid = rs.getInt(1);
                String fname = rs.getString(2);
                Date hdate = rs.getDate(3);
                double sal = rs.getDouble(4);
                double comm = rs.getDouble(5);
                System.out.printf("%d %s %s, %f %f\n", empid, fname, hdate, sal, comm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DBUtil.dbDisconnect(conn, st, rs);
    }

    public static void main2() {
        Connection conn = DBUtil.dbconnect();
        Statement st = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 이름>> ");
        String name = sc.next();
        String sql = " select employee_id, first_name, hire_date," + "	salary, commission_pct" + " from employees"
                + " where first_name like '%" + name + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int empid = rs.getInt(1);
                String fname = rs.getString(2);
                Date hdate = rs.getDate(3);
                double sal = rs.getDouble(4);
                double comm = rs.getDouble(5);
                System.out.printf("%d %s %s, %f %f\n", empid, fname, hdate, sal, comm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DBUtil.dbDisconnect(conn, st, rs);
    }
}