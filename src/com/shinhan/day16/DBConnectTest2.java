package com.shinhan.day16;

import java.sql.*;

public class DBConnectTest2 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@Localhost:1521:xe";
        String userid = "hr", password = "hr";
        String sql = """
                select first_name, hire_date, department_id, salary, commission_pct
                from employees
                where hire_date between '2000-01-01' and '2009-12-31'
                and department_id in (30, 50, 80)
                and salary between 5000 and 17000
                and commission_pct is not null
                order by hire_date asc, salary desc
                """;
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, userid, password);
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String first_name = rs.getString(1);
                Date hire_date = rs.getDate(2);
                int department_id = rs.getInt(3);
                double salary = rs.getDouble(4);
                double commission_pct = rs.getDouble(5);
                System.out.printf("%s, %s, %d, %f, %2.2f\n",
                        first_name, hire_date, department_id, salary, commission_pct);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}