package com.shinhan.day08;

public class InnerClassTest {
    InnerClassTest() {
        class A {
        } //메서드 속 클래스 -> 로컬 클래스
        A aa = new A();
    }

    public static void main(String[] args) {
        //f1();
        //f2();
        //f3();
        f4();
    }

    private static void f4() {
        //지역변수를 Local Class에서 사용되면 반드시 변수는 final이 됨. 즉 변경 불가!
        int localVar = 100;
        //localVar++; 지역변수 값 변경 불가...
        System.out.println(localVar);

        class LocalClass { //로컬 클래스
            int field = 200;
            static int field2 = 200;

            void instanceMethod() {
                System.out.println("field = " + field);
                System.out.println("field2 = " + field2);
                System.out.println("지역변수 접근: " + localVar); //지역변수에는 접근 가능
                //locaVar++; 지역변수 값 변경 불가...
            }

            static void staticMethod() {
                //System.out.println("field = " + field); 사용 불가
                System.out.println("field2 = " + field2);
            }
        }
        System.out.println(LocalClass.field2);
        LocalClass.staticMethod();

        LocalClass local = new LocalClass();
        System.out.println(local.field);
        local.instanceMethod();
    }

    private static void f3() {
        //객체 생성과 무관
        System.out.println(OuterClass.StaticInnerClass.staticVar2);
        OuterClass.StaticInnerClass.staticF();

        OuterClass.StaticInnerClass inner = new OuterClass.StaticInnerClass();
        System.out.println(inner.instanceVar2);
        System.out.println(inner.score);
        inner.instanceF();
    }

    private static void f2() {
        //객체 생성과 무관
        System.out.println(OuterClass.InnerClass.staticVar2);
        OuterClass.InnerClass.staticF();

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(inner.instanceVar2);
        System.out.println(inner.score);
        inner.instanceF();
    }

    private static void f1() {
        OuterClass outer = new OuterClass();
        System.out.println(outer.instanceVar);
        System.out.println(outer.score);
        System.out.println(OuterClass.staticVar);
        outer.instanceF();
        OuterClass.staticF();
    }
}