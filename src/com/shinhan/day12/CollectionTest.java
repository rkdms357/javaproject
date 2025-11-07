package com.shinhan.day12;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        f13();
    }

    private static void f13() {
        Properties pro = new Properties(); //키와 값을 문자로 넣음
        InputStream is = CollectionTest.class.getResourceAsStream("../util/oracleDB.properties");
        try {
            pro.load(is);
            String driver = pro.getProperty("driver");
            String url = pro.getProperty("url");
            String username = pro.getProperty("username");
            String password = pro.getProperty("password");
            String adminName = pro.getProperty("admin");

            System.out.println(driver);
            System.out.println(url);
            System.out.println(username);
            System.out.println(password);
            System.out.println(adminName);

            for (Object key : pro.keySet()) {
                System.out.println(key + "==>" + pro.getProperty((String) key));
            }
            System.out.println("=================");
            for (Map.Entry<Object, Object> entry : pro.entrySet()) {
                String key = (String) entry.getKey();
                String value = pro.getProperty(key);
                System.out.println(key + "*******" + value);
            }

            Enumeration<Object> enumList = pro.elements();
            while (enumList.hasMoreElements()) {
                String key = (String) enumList.nextElement();
                String value = pro.getProperty(key);
                System.out.println(key + "*******" + value);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void f12() {
        // 멀티스레드환경에서 안정적(동기화 지원)
        Map<String, Integer> data = new Hashtable<>(); //HashMap은 데이터를 잃어버림....
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    data.put("키" + i, i); //또는 String.valueOf(i), i
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    data.put("키" + i, i); //또는 String.valueOf(i), i
                }
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();  //t1이 끝날때 까지 기다림
            t2.join(); //t2가 끝날때 까지 기다림
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(data.size() + "건 put됨");
        System.out.println("-------f12 End-------");
    }

    private static void f11() {
        // Hashtable : 멀티스레드에서 공유할때 동기화 지원
        Map<String, Integer> data = new Hashtable<>();
        data.put("홍길동", 100);
        data.put("홍길동", 99); // 같은키가 있으면 수정됨
        data.put("김길동", 80);
        data.put("박길동", 77);
        System.out.println(data);
    }

    private static void f10() {
        Map<Book, Integer> data = new HashMap<>();
        data.put(new Book("A", "홍길동1", 10000), 5);
        data.put(new Book("A", "홍길동2", 20000), 5);
        data.put(new Book("A", "홍길동1", 30000), 5);
        data.put(new Book("A", "홍길동1", 40000), 5);
        data.put(new Book("A", "홍길동1", 50000), 100);
        // Set은 중복허용을 안해서 같으면 안들어가지만
        // Map은 키가 같으면 값이 덮어짐
        // System.out.println(data);
        for (Map.Entry<Book, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey() + "==" + entry.getValue());
        }
    }

    private static void f9() {
        // Map 자료구조에 키는 책의 ISBN(문자), 값은 Book....저장된 data 출력(keySet, Entry)
        Map<String, Book> data = new HashMap<>();
        data.put("1234", new Book("A", "홍길동", 1000));
        data.put("1235", new Book("B", "김길동", 1000));
        data.put("1236", new Book("C", "박길동", 1000));
        System.out.println(data);
        Set<String> keys = data.keySet();
        for (String key : keys) {
            System.out.println(key + "-->" + data.get(key));
        }
    }

    private static void f8() {
        // Map : 키와 값의 쌍으로 이루어짐(Entry = key + value)
        // Map <--- HashMap, Hashtable, TreeMap, Properties
        Map<String, Integer> data = new HashMap<>();
        data.put("홍길동", 100);
        data.put("홍길동", 99); // 같은 키가 있으면 수정됨
        data.put("김길동", 80);
        data.put("박길동", 77);
        System.out.println(data);
        System.out.println(data.get("홍길동"));
        Set<String> keys = data.keySet(); // 키들
        System.out.println("----------향상for-----------");
        for (String key : keys) {
            System.out.println(key + "-->" + data.get(key));
        }
        System.out.println("----------반복자(iterator)-----------");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + "-->" + data.get(key));
        }
        Set<Map.Entry<String, Integer>> entryList = data.entrySet(); // 여러건
        System.out.println("----------향상for-----------");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
        System.out.println("----------반복자(iterator)-----------");
        Iterator<Map.Entry<String, Integer>> it2 = entryList.iterator();
        while (it2.hasNext()) {
            Map.Entry<String, Integer> entry = it2.next();
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }

    private static void f7() {
        // Set <--- HashSet, TreeSet(자동 Sort, 저장시 순서있음)
        // HashSet : 저장시 순서없음, 중복 안됨(hashCode(), equals())
        Set<Book> data = new HashSet<>();
        data.add(new Book("A", "홍길동", 1000));
        data.add(new Book("A", "홍길동", 2000)); // 동일객체가 존재하면 add불가
        data.add(new Book("B", "박길동", 3000));
        data.add(new Book("C", "김길동", 1000));
        System.out.println(data);
        // 일반 for불가
        System.out.println("----------향상for-----------");
        for (Book b : data) {
            System.out.println(b);
        }
        System.out.println("----------반복자(iterator)-----------");
        Iterator<Book> it = data.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void f6() {
        // Set <--- HashSet, TreeSet(자동 Sort, 저장시 순서있음)
        // HashSet : 저장시 순서없음, 중복 안됨
        Set<String> data = new HashSet<>();
        data.add("월");
        data.add("토");
        data.add("일");
        data.add("월"); // 얘는 안 들어감
        // data.add(0, "일"); 순서불가
        System.out.println(data);
        // 일반 for불가
        System.out.println("----------향상for-----------");
        for (String s : data) {
            System.out.println(s);
        }
        System.out.println("----------반복자(iterator)-----------");
        Iterator<String> it = data.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void f5() {
        List<String> data = new ArrayList<>();
        data.add("월");
        data.add("토");
        data.add("일");
        data.add("월");
        data.add(0, "일");
        data.set(1, "목");
        System.out.println(data); // toString이 호출됨
        System.out.println(data.get(0));
        data.clear();
        System.out.println(data);
        System.out.println(data.contains("일"));
    }

    private static void f4() {
        // 멀티스레드환경에서 안정적(동기화 지원)
        List<String> data = new Vector<>();
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    data.add(getName() + "----" + i);
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    data.add(getName() + "----" + i);
                }
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join(); // t1과 t2가 끝나지 않으면 내려가지않음
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("개수: " + data.size());
        System.out.println("---함수 끝---");
    }

    private static void f3() {
        // 많은 양의 데이터를 add()
        long start = System.nanoTime();
        List<String> data = new LinkedList<>(); // LinkedList가 ArrayList보다 더효율적
        for (int i = 1; i <= 1000; i++) {
            // data.add(String.valueOf(i) + "!!!");
            data.add(0, String.valueOf(i) + "!!!"); // 앞에다가 추가
        }
        long end = System.nanoTime();
        System.out.println("LinkedList 걸린시간: " + (end - start));
    }

    private static void f2() {
        // 많은 양의 데이터를 add()
        long start = System.nanoTime();
        List<String> data = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            data.add(0, String.valueOf(i) + "!!!");
        }
        long end = System.nanoTime();
        System.out.println("ArrayList 걸린시간: " + (end - start));
    }

    private static void f1() {
        // 배열 : 연속공간, 개수 고정, 1가지 타입만
        // Collection <--- List(순서 있음, 중복 허용), Set(순서 없고, 중복 불가)
        // <--- Map(키와 값의 쌍)
        // List <--- ArrayList, LinkedList, Vector
        List<String> data = new ArrayList<>(); // LinkedList, Vector 아무거나 써도됨
        data.add("월");
        data.add("토");
        data.add("일");
        data.add("월");
        System.out.println("----------일반for-----------");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        System.out.println("----------향상for-----------");
        for (String s : data) {
            System.out.println(s);
        }
        System.out.println("----------반복자(iterator)-----------");
        Iterator<String> it = data.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}