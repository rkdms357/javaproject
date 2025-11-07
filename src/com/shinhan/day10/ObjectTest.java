package com.shinhan.day10;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.shinhan.util.DateUtil;

public class ObjectTest {
    public static void main(String[] args) {
        f18();
    }

    private static void f18() {
        //이메일들 중 다음이메일만 추출
        String exp = "\\w+@([0-9a-zA-Z]+)\\.\\w{3}";
        String data = "aaaaa 안뇽~ 방가방가 wed04@daum.net bbbbbb master@naver.com";

        Pattern emailPattern = Pattern.compile(exp);
        Matcher emailMacher = emailPattern.matcher(data);
        while (emailMacher.find()) {
            String company = emailMacher.group(1);
            if (company.equals("daum")) {
                System.out.println(emailMacher.group());
            }
        }
    }

    private static void f17() {
        String exp1 = "([01]{3})-([0-9]{3,4})-([0-9]{4})";
        String data1 = "010-1234-5678";

        Pattern phonePattern = Pattern.compile(exp1);
        Matcher phoneMacher = phonePattern.matcher(data1);
        while (phoneMacher.find()) {
            System.out.println(phoneMacher.group());
            System.out.println(phoneMacher.group(0));
            System.out.println(phoneMacher.group(1)); //010
            System.out.println(phoneMacher.group(2)); //1234
            System.out.println(phoneMacher.group(3)); //5678
        }
    }

    // 제어문자 : \t -> tab. \\ -> \
    private static void f16() {
        //[abc123ABC]
        //[a-zA-Z0-9]
        String exp1 = "[01]{3}-[0-9]{3,4}-[0-9]{4}";
        String data1 = "010-1234-5678";

        String exp2 = "\\w+@[0-9a-zA-Z]+\\.\\w{3}";
        String data2 = "shinhan@daum.net";

        boolean result1 = Pattern.matches(exp1, data1);
        System.out.println(result1);

        boolean result2 = Pattern.matches(exp2, data2);
        System.out.println(result2);

        String data3 = "010-1234-5678 ccccccccc 010-8989-7878 bbbbbb 010-7045-8989";
        String data4 = "aaaaa wed04@daum.net bbbbbb master@naver.com";

        Pattern phonePattern = Pattern.compile(exp1);
        Matcher phoneMacher = phonePattern.matcher(data3);
        while (phoneMacher.find()) {
            System.out.println(phoneMacher.group());
        }

        Pattern emailPattern = Pattern.compile(exp2);
        Matcher emailMacher = emailPattern.matcher(data4);
        while (emailMacher.find()) {
            System.out.println(emailMacher.group());
        }
    }

    private static void f15() {
        java.sql.Date aa = DateUtil.convertSQLDate("2025-11-05");
        System.out.println(aa);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dt = "2025-11-05";

        //Exception : 1)unChecked 2)Checked : 컴파일시 반드시 처리
        try {
            Date dt2 = sdf.parse(dt);
            System.out.println(dt2);

            java.sql.Date dt3 = new java.sql.Date(dt2.getTime());
            System.out.println(dt3);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void f14() {
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a D일 w주");
        String result = sdf.format(dt);
        System.out.println(result);
    }

    private static void f13() {
        DecimalFormat df = new DecimalFormat("\u00A4###,000,000.00");
        double value = 12345678.1234;
        String result = df.format(value);
        System.out.println(result);
    }

    private static void f12() {
        LocalDateTime dt = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.of(2025, 8, 31, 0, 0);

        System.out.println(dt);
        System.out.println(dt.plusDays(1));
        System.out.println(dt2);
        System.out.println(dt2.getYear());
        System.out.println(dt2.getMonthValue());
        System.out.println(dt2.getDayOfMonth());

        Duration d = Duration.between(dt2, dt);
        System.out.println(d.toDays());
        System.out.println(d.toHours());
        System.out.println(d.toMinutes());

		/*
		System.out.println(dt.toString().split("T")[0]);

		LocalDate dt2 = LocalDate.now();
		System.out.println(dt2);
		*/
    }

    private static void f11() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal); //대문자로 된게 상수...

        cal.set(2005, 8, 31); //0월부터 있어서
        //set : 월은 -1
        //get : 월은 +1

        System.out.println(cal.get(1)); //x
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }

    private static void f10() {
        Date d1 = new Date();
        java.sql.Date d2 = new java.sql.Date(d1.getTime());
        System.out.println(d1);
        System.out.println(d2);
    }

    private static void f9() {
        Date d1 = new Date();
        //util.Date --> sql.Date
        System.out.println(d1);
        System.out.println(DateUtil.convertSQLDate(d1));
    }

    private static void f8() {
        //기본형은 값을 할당, 비교가능, 연산가능
        //Wrapper Class는 기본형 + 기능추가
        int a = 10;
        System.out.println(a > 10);
        System.out.println(++a);

        //Integer b = new Integer(100); //Auto Boxing
        Integer b = 100;
        System.out.println(b);
        System.out.println(b.intValue()); //unBoxing
        System.out.println(b > 100);
        System.out.println(++b);
        System.out.println(b.floatValue());
        String result = Integer.toBinaryString(a); //1011
        System.out.println(result);
    }

    private static void f7() {
        String data = "홍길동/이수홍/박연수,김길동 박길동:이길동";
        String[] arr = data.split("/|,| |:"); //|로 구분되어야 함
        for (String s : arr) {
            System.out.println(s);
        }
    }

    private static void f6() {
        String data = "홍길동/이수홍/박연수,김길동 박길동:이길동";
        StringTokenizer st = new StringTokenizer(data, "/, :"); //구분자를 나열
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    private static void f5() {
        String s1 = "이것이 자바다";
        System.out.println(s1.replace("자바", "JAVA"));
        System.out.println(s1); //그대로
        s1 = s1.replace("자바", "JAVA"); //주소가 바뀜. 자원낭비!!
        System.out.println(s1);

        //가변문자열임
        s1 = "이것이 자바다";
        StringBuilder sb = new StringBuilder(s1);
        int start = sb.indexOf("자바");
        if (start < 0) return;
        sb.replace(start, start + 2, "JAVA");
        sb.append("!!!!");
        System.out.println(sb);
    }

    private static void f4() throws UnsupportedEncodingException {
        //String은 고정 문자열. 변경 불가. 변경한다면 새로운 주소로 만들어지는 것!
        String s1 = "이것이 자바다";
        String s2 = new String(s1); //상수풀에 있는 걸 그대로 사용

        byte[] arr = s1.getBytes(); //기본적으로 OS의 인코딩방식은 MS949, euc-kr 한글자를 2바이트 처리
        System.out.println(Arrays.toString(arr));

        char[] arr2 = s1.toCharArray();
        System.out.println(Arrays.toString(arr2));

        String s3 = new String(arr);
        String s4 = new String(arr2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s1.getBytes("UTF-8").length + "--" + (3 * 6 + 1));
        System.out.println(s1.getBytes("euc-kr").length + "--" + (2 * 6 + 1));

        //인코딩 방식이 다르면 한글깨짐
        byte[] arr3 = s1.getBytes("euc-kr");
        String s5 = new String(arr3, "UTF-8");
        System.out.println(s5);
    }

    //JRE환경값들
    private static void f3() {
        Map<String, String> map = System.getenv();
        for (String key : map.keySet()) {
            System.out.println(key + "==>" + map.get(key));
        }
    }

    private static void f2() {
        long time = System.currentTimeMillis();
        System.out.println(time);
        System.out.println(new Date(time));
        System.out.println(new java.sql.Date(time));

        System.out.println(false);
        System.err.println(false); //색깔만 빨갛게 출력

        //System.exit(0); //프로그램 종료할때 사용. 0은 정상 종료. -1은 비정상 종료
    }

//    private static void f1() {
//        Member m1 = new Member(null, "김", 0);
//        Member m2 = new Member(null, "박");
//        System.out.println(m1);
//    }
}