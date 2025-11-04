package com.shinhan.day09;

import java.io.IOException;

/*Exception(예외) : 프로그래머의 노력으로 프로그램이 중지되지 않고 계속 진행하도록 할 수 있음
 * 1. unChecked Exception(실행시에 체크)실행예외(RuntimeException)
 * 2. Checked Exception(컴파일시에 체크)일반예외(Exception - RuntimeException)
 *
 * Exception 처리 : try / catch / finally(예외가 발생했든 안했든 반드시 수행!)
 * 자원반납을 위해 finally에서 코드 가능
 * 자동자원 반납이 좋음. try(이곳에서 생성된 자원은 벗어나면 자동닫힘){} catch{}
 *
 * 사용자 정의 예외(개발자가 예외를 만들 수 있음)
 *
 * 예외 강제발생
 */
public class ExceptionTest2 {
    public static void main(String[] args) throws IOException {
        // f1();
        // System.out.println("------main End------");
        // f2();
        // System.out.println("------main End------");
        // f3();
        // System.out.println("------main End------");
        // f4();
        // System.out.println("------main End------");
        // f5();
        // System.out.println("------main End------");
        try {
            f6();
        } catch (잔고부족예외 e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("------main End------");
    }
    //강제 예외 발생시키기
    //throws : 던지기
    //throw : 발생함
    private static void f6() throws 잔고부족예외 {
        int balance = 10;
        int amount = 30;
        if (balance < amount) {
            throw new 잔고부족예외("출금액이 잔고보다 많음");
        }
        System.out.println("------f6 End------");
    }
    private static void f5() {
        try (MyResource my = new MyResource("마이리소스")) {
            System.out.println(my.read1());
            System.out.println(my.read2());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void f4() {
        // 조건문으로 오류 가능성을 체크하는 것보다 try/catch를 이용해서 업무로직과 오류처리를 분리하는 것이 좋음
        int data;
        // 자동 리소스 닫기
        try (FileReader fr = new FileReader("src/com/shinhan/day09/Review.java")) {
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않음");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            System.out.println("------반드시 처리할 문장------");
        }
        System.out.println("------f3 End------");
    }
    private static void f3() {
        // 조건문으로 오류 가능성을 체크하는 것보다 try/catch를 이용해서 업무로직과 오류처리를 분리하는 것이 좋음
        int data;
        FileReader fr = null;
        // 파일 열기
        try {
            fr = new FileReader("src/com/shinhan/day09/Review.java");
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않음");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("------f3 End------");
    }
    // IOException가 더 상위Exception, FileNotFoundException가 더 하위Exception
    private static void f2() throws IOException {
        int data;
        FileReader fr = null;
        // 파일 열기
        fr = new FileReader("src/com/shinhan/day09/Review.java");
        // EOF(End of File) : -1
        while ((data = fr.read()) != -1) {
            System.out.print((char) data);
        }
        // 자원 반납!! file을 쓰고 닫지 않으면 다른 프로그램에서 이 파일을 사용불가
        fr.close();
    }
    private static void f1() {
        int a = 10;
        int b = call();
        int[] arr = { 10, 20, 30 };
        String name = "이것이 자바다";
        String su = "100";
        Object obj = new String("자바");
        try {
            // 업무로직, 예외발생 가능성 있는 문장줄을 try에 기술
            // 예외처리는 catch 기술
            System.out.println("나누기: " + a / b);
            System.out.println("배열의 3번째 값: " + arr[2]);
            System.out.println(name.length());
            System.out.println(Integer.parseInt(su) + 200);
            // String str = (String)obj;
            Integer intg = (Integer) obj;
            // System.out.println("문자열의 길이: " + str.length());
            System.out.println("문자열의 길이: " + intg.toString());
            // catch로 예외처리시에 하위Exception을 먼저 작성, 상위Exception을 나중에 작성
            // Exception > RuntimeException > 다른 Exception
        } catch (ArithmeticException e) {
            System.out.println("정수는 0으로 나누기 불가");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index 범위를 벗어남");
//		} catch (NullPointerException | NumberFormatException e) {
//			System.out.println("null이거나 숫자가 아님");
        } catch (NullPointerException e) {
            System.out.println("값이 정의되지 않음(null)");
        } catch (NumberFormatException e) {
            System.out.println("숫자형 문자가 아님");
        } catch (ClassCastException e) {
            System.out.println("문자로 Casting만 됨");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("기타 Exception");
        }
        System.out.println("------f1 End------");
    }
    private static int call() {
        return 2;
    }
}