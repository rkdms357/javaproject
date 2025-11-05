package com.shinhan.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static java.sql.Date convertSQLDate(Date dt) {
        java.sql.Date dt2 = new java.sql.Date(dt.getTime());
        return dt2;
    }

    public static java.sql.Date convertSQLDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date dt3 = null;
        try {
            Date dt2 = sdf.parse(dateStr);
            dt3 = new java.sql.Date(dt2.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dt3;
    }
}