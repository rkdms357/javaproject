package com.shinhan.day07;

class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends B {}

class F extends C {}

public class TireTest {

    public static void main(String[] args) {
        B b1 = new D();
        B b2 = new E();
        B b3 = new B();

        //B b4 = (B)new A(); 불가
        A a = new B();
        B b4 = (B) a;

        method(new B());
        method(new D());
        method(new E());
        //method((B)new A()); 불가
        method((B) a);
    }

    public static void method(B b) {}

    public static void f1() {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;
        snowTire.run();
        tire.run();
    }
}