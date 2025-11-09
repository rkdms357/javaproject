package com.shinhan.day04;

public class Spliting {

    /*
     * 	배열 크기 : 4
        서울시 강남구 역삼동 삼성SDS멀티캠퍼스
     */
    public static void main(String[] args) {
        Spliting p = new Spliting();
        String addr = "서울시,강남구,역삼동,삼성SDS멀티캠퍼스";
        String[] addrArr = p.split(addr, ',');
        System.out.println("배열 크기 : " + addrArr.length);
        for (int i = 0; i < addrArr.length; i++) {
            System.out.print(addrArr[i] + " ");
        }
    }

    private String[] split(String str, char separator) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == separator) count++;
        }

        String[] result = new String[count];

        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == separator) {
                result[idx++] = sb.toString();
                sb.setLength(0);
            } else {
                sb.append(ch);
            }
        }
        result[idx] = sb.toString();

        return result;
    }
}