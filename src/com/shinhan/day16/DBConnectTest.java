package com.shinhan.day16;

import java.sql.*;

public class DBConnectTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.Oracle이 제공하는 Driver를 메모리에 load
        //2.Connection
        //3.Statement
        //4.SQL문작성해서 DB에 보내고 결과를 받음
        Class.forName("oracle.jdbc.driver.OracleDriver"); //driver를 메모리에 올림
        System.out.println("1.Oracle이 제공하는 Driver를 메모리에 loade됨");
        String url = "jdbc:oracle:thin:@Localhost:1521:xe";
        String userid = "hr", password = "hr";
        Connection conn = DriverManager.getConnection(url, userid, password);
        System.out.println("2.Connection 성공: " + conn);
        String sql = "select * from employees where salary >= 7000";
        Statement st = conn.createStatement();
        System.out.println("3.Statement(통로) 만들기");
        ResultSet rs = st.executeQuery(sql);
        System.out.println("4.Query 실행하고 ResultSet받기");
        while (rs.next()) {
            System.out.print(rs.getInt(1)); //칼럼의 순서
            System.out.printf("  %-15s", rs.getString("first_name")); //칼럼의 이름
            System.out.printf("%6d\n", rs.getInt("salary")); //칼럼의 이름
        }
        System.out.println("5.자원반납");
        rs.close();
        st.close();
        conn.close();
    }
}