package com.shinhan.day10;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Scanner;

//리플렉션 : 클래스의 메타데이터의 정보를 알아내기위해 필요
//멤버(생성자, 필드, 메서드...)
public class ObjectTest2 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f7();
    }

    private static void f7() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method[] arr = PrintService.class.getDeclaredMethods();
        for (Method method : arr) {
            System.out.println(method.getName());

            PrintAnnotation printAnno = method.getAnnotation(PrintAnnotation.class);
            display(printAnno);
            method.invoke(new PrintService());
        }
    }

    private static void display(PrintAnnotation printAnno) {
        if (printAnno == null) return;
        int su = printAnno.number();
        String value = printAnno.value();
        System.out.println(su + ":" + value);

        for (int i = 1; i <= su; i++) {
            System.out.print(value);
        }
        System.out.println();
    }

    private static void f6() throws IOException {
        Class aa = ObjectTest2.class;
        //1.경로
        URL url = aa.getResource("images/umbrella.jpg");
        System.out.println(url.getPath());
        //2.파일읽기
        InputStream is = aa.getResourceAsStream("images/umbrella.jpg");
        int data;
        while ((data = is.read()) != -1) {
            System.out.print((char) data);
        }
    }

    private static void f5() {
        // class의 resource 정보 얻기
        Class c1 = Car.class;
        URL url = c1.getResource("application.txt");
        System.out.println("경로: " + url.getPath());
        InputStream is = c1.getResourceAsStream("application.txt");
        Scanner sc = new Scanner(is);
        String data;
        try {
            while ((data = sc.nextLine()) != null) {
                System.out.println(data);
            }
        } catch (NoSuchElementException e) {

        }
    }

    private static void f4() throws IOException {
        // src는 개발경로
        // bin은 실행경로
        FileReader fr = new FileReader("src/com/shinhan/day10/application.txt");
        int data;
        while ((data = fr.read()) != -1) {
            System.out.println((char) data);
        }
        fr.close();
    }

    private static void f3() {
        Class clazz = Car.class;
        System.out.println("생성자 정보");
        Constructor[] arr = clazz.getDeclaredConstructors();
        for (Constructor c : arr) {
            System.out.print(c.getName());
            Class[] parameters = c.getParameterTypes();
            printParameters(parameters);
        }
        System.out.println();
        System.out.println("필드정보");
        Field[] field = clazz.getDeclaredFields();
        for (Field f : field) {
            System.out.println(f.getType().getName() + " " + f.getName());
        }
        System.out.println();
        System.out.println("메서드정보");
        Method[] method = clazz.getDeclaredMethods();
        for (Method m : method) {
            System.out.println(m.getName());
            Class[] parameters = m.getParameterTypes();
            printParameters(parameters);
        }
    }

    private static void printParameters(Class[] parameters) {
        for (int i = 0; i < parameters.length; i++) {
            System.out.println(parameters[i].getName());
            if (i < (parameters.length - 1)) {
                System.out.print(",");
            }
        }
    }

    private static void f2() {
        Class c1 = Car.class;
        Field[] arr = c1.getDeclaredFields();
        for (Field field : arr) {
            System.out.println(field.getName());
        }
    }

    private static void f1() throws ClassNotFoundException {
        Class c1 = Car.class;
        Class c2 = Class.forName("com.shinhan.day10.Car");
        Car car = new Car("aa", 100, "bb");
        Class c3 = car.getClass();
        Constructor[] arr = c1.getDeclaredConstructors(); // 생성자들을 얻어옴
        for (Constructor cc : arr) {
            System.out.println("이름: " + cc.getName());
            System.out.println("param개수: " + cc.getParameterCount());
            System.out.println("----------------------------");
        }
    }
}