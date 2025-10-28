package com.shinhan.day04;

public class LAB2 {
    public static void main(String[] args) {
        f1();
        f2();
    }

    //함수 : 문장들의 묶음, 모듈화, 재사용하기 위해 만듦
    //정의 : returnType필수 함수이름(매개변수타입 변수이름){ }
    //modifier
    //1)접근권한 : public > protected > 생략 > private
    //2)활용방법 : static, final, abstract, synchronized
    private static void f2() {
        String s1 = "자바";
        String s2 = new String("자바");
        byte[] arr = {65, 66, 67}; //'A', 'B', 'C'
        char[] arr2 = {'A', 'B', 'C'};
        String s3 = new String(arr);
        String s4 = new String(arr2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    private static void f1() {
        System.out.println("문자열에 특정문자 변경하는 테스");
        System.out.println("-------------Sample 1 --------------");
        String str1 = myReplace("hello world", 'l', '*');
        System.out.println(str1);

        System.out.println("-------------Sample 2 --------------");
        String str2 = myReplace("hello world", ' ', '-');
        System.out.println(str2);

        System.out.println("-------------Sample 3 --------------");
        String str3 = myReplace("hello world", 'a', '*');
        System.out.println(str3);
    }

    private static String myReplace(String str, char oldChar, char newChar) {
//		String result = null;
//		char[] arr = str.toCharArray();
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == oldChar) arr[i] = newChar;
//		}
//		result = new String(arr);
//		return result;

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == oldChar) {
                newStr += newChar;
            } else {
                newStr += ch;
            }
        }
        return newStr;
    }
}