package com.shinhan.day13;

import java.util.*;

//구현클래스... 한번만 쓸거면 익명구현클래스로
class MyDescendingInteger implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // -1 0 +1 이렇게 주면은 Ascending
        //return o1-o2; Ascending
        return o2 - o1; //Descending
    }
}

class Car implements Comparable<Car> {
    String model;
    int price;

    public Car(String model, int price) {
        super();
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Car [model=").append(model).append(", price=").append(price).append("]");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        return Objects.equals(model, other.model) && price == other.price;
    }

    @Override
    public int compareTo(Car obj) {
        int priceResult = price - obj.price; //price Ascending
        if (priceResult == 0) {
            return obj.model.compareTo(model); //model Descending
        }
        return priceResult; //Ascending Sort
    }
}

class Friend implements Comparable<Friend> {
    String name;
    String phone;

    public Friend(String name, String phone) {
        super();
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Friend [name=").append(name).append(", phone=").append(phone).append("]");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Friend other = (Friend) obj;
        return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
    }

    @Override
    public int compareTo(Friend obj) {
        return name.compareTo(obj.name);
    }
}

public class Review {
    public static void main(String[] args) {
        f7();
    }

    private static void f10() {
        //키는 같으면 추가안함. 같은 키에 값이 다르면 수정함
        //HashMap : 키는 같으면 추가안함
        //TreeMap : 키 순으로 put 됨
        //Map<Friend, Integer> map = new TreeMap<>(); //HashSet, HashMap은 생길때마다 새주소로 만들어짐. 그래서 동일성 체크를 해야함. @EqualsAndHashCode

        Comparator<Friend> comparator = new Comparator<Friend>() {

            @Override
            public int compare(Friend o1, Friend o2) {
                return o1.phone.compareTo(o2.phone); //전화번호로 Ascending
            }
        };
        Comparator<Friend> comparator2 = (aa, bb) -> aa.phone.compareTo(bb.phone);
        Map<Friend, Integer> map = new TreeMap<>(comparator2);
        map.put(new Friend("홍2", "010-1234-5678"), 100);
        map.put(new Friend("홍2", "010-1234-5678"), 100);
        map.put(new Friend("홍1", "010-5555-5678"), 300);
        map.put(new Friend("홍3", "010-9999-5678"), 400);
        map.put(new Friend("홍5", "010-7777-5678"), 200);
        map.put(new Friend("홍4", "010-6666-5678"), 500);
        for (Friend key : map.keySet()) {
            System.out.println(key + "-->" + map.get(key));
        }
    }

    private static void f9() {
        //키는 같으면 추가안함. 같은 키에 값이 다르면 수정함
        //TreeMap : 키 순으로 put 됨
        Map<String, Integer> map = new TreeMap<>();
        map.put("홍2", 100);
        map.put("홍1", 200);
        map.put("홍4", 300);
        map.put("홍3", 400);
        map.put("홍5", 500);
        for (String key : map.keySet()) {
            System.out.println(key + "-->" + map.get(key));
        }
    }

    //구현된 compare을 이용하지 않고 재정의해서 이용
    private static void f8() {
        //Set은 값이 같으면 add안함

//		TreeSet<Car>data = new TreeSet<>(new Comparator<Car>() {
//
//			@Override
//			public int compare(Car o1, Car o2) {
//				return o2.model.compareTo(o1.model); //model로 descending
//			}
//		});

        Comparator<Car> comparator2 = (o1, o2) -> o2.model.compareTo(o1.model); //람다표현식
        TreeSet<Car> data = new TreeSet<>(comparator2);

        data.add(new Car("A", 2000));
        data.add(new Car("A", 2000));
        data.add(new Car("D", 2000));
        data.add(new Car("C", 1000));
        data.add(new Car("B", 3000));
        for (Car car : data) {
            System.out.println(car);
        }
//		Iterator<Car> it = data.descendingIterator(); //기존것에서 반대로 나옴
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
    }

    //구현된 Compare이용
    //TreeSet
    private static void f7() {
        //Set은 값이 같으면 add안함
        TreeSet<Car> data = new TreeSet<>();
        data.add(new Car("A", 2000));
        data.add(new Car("A", 2000));
        data.add(new Car("D", 2000));
        data.add(new Car("C", 1000));
        data.add(new Car("B", 3000));
        for (Car car : data) {
            System.out.println(car);
        }
    }

    //HashSet
    private static void f6() {
        HashSet<Car> data = new HashSet<>();
        data.add(new Car("A", 2000));
        data.add(new Car("A", 2000)); //HashSet은 생길때마다 새주소로 만들어짐. 그래서 동일성 체크를 해야함. @EqualsAndHashCode
        data.add(new Car("C", 1000));
        data.add(new Car("B", 3000));
        for (Car car : data) {
            System.out.println(car);
        }
    }

    private static void f5() {
        Car[] arr = {
                new Car("A", 2000),
                new Car("B", 1000),
                new Car("C", 3000),
        };
        //Arrays.sort(arr); //이렇게 비교불가 Comparable 인터페이스를 구현해야함
    }

    private static void f4() {
        String[] arr = {"자바", "오라클", "웹", "프레임워크", "리액트"};
        //Arrays.sort(arr); //Ascending

		/*
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); //String은 이렇게 Descending
			}
		});
		*/

        //람다표현식 (@FunctionalInterface면 가능)
        Arrays.sort(arr, (o1, o2) -> o2.compareTo(o1));
        System.out.println("sort후 : " + Arrays.toString(arr));
    }

    private static void f3() {
        Integer[] arr = {100, 50, 70, 30, 90};
        //1)Arrays.sort(arr); //Ascending Sort

        //2)구현클래스이용
        Arrays.sort(arr, new MyDescendingInteger()); //Descending

        //3)익명구현클래스만들기
		/*Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1; //descending
			}
		});
		*/

        //4)람다표현식 (@FunctionalInterface면 가능)
        Arrays.sort(arr, (x, y) -> y - x);
        System.out.println("sort후 : " + Arrays.toString(arr));
    }

    private static void f2() {
        String a = "A";
        String b = "D";
        int result = a.compareTo(b);
        System.out.println(result);
        // -1 : 내가 작음(<)
        // 0 : 둘이 같다(=)
        // 1 : 내가 크다(>)
    }

    private static void f1() {
        Integer a = 10;
        Integer b = 15;
        int result = a.compareTo(b);
        System.out.println(result);
        // -1 : 내가 작음(<)
        // 0 : 둘이 같다(=)
        // 1 : 내가 크다(>)
    }
}