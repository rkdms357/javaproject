package com.shinhan.day08;

//필드 + 생성자 + 메서드 + instance block + static block + inner class
public class OuterClass {
    String instanceVar = "OuterClass의 instanceVar";
    static String staticVar = "OuterClass의 staticVar";

    void instanceF() {
        System.out.println("OuterClass의 instanceF(): " + instanceVar);
        System.out.println("OuterClass의 instanceF(): " + staticVar);
    }

    static void staticF() {
        //System.out.println("OuterClass의 staticF(): " + instanceVar); 사용 불가
        System.out.println("OuterClass의 staticF(): " + staticVar);
    }

    int score = 100;

    class InnerClass {
        String instanceVar2 = "InnerClass의 instanceVar";
        static String staticVar2 = "InnerClass의 staticVar";

        String score = "이백점"; //외부 score변수와 충돌!!

        void instanceF() {
            //외부 변수 접근 가능
            System.out.println("OuterClass의 instanceF(): " + instanceVar);
            System.out.println("OuterClass의 instanceF(): " + staticVar);

            //내부 변수 접근 가능
            System.out.println("InnerClass의 instanceF(): " + instanceVar2);
            System.out.println("InnerClass의 instanceF(): " + staticVar2);
            System.out.println("InnerClass의 instanceF(): " + score); //내부 score
            System.out.println("InnerClass의 instanceF(): " + OuterClass.this.score); //외부 score. this 사용!!
        }

        static void staticF() {
            //instance 생성없이 사용하므로 static만 가능

            //System.out.println("OuterClass의 instanceF(): " + instanceVar); 사용불가
            System.out.println("OuterClass의 staticF(): " + staticVar);

            //System.out.println("InnerClass의 instanceF(): " + instanceVar2); 사용불가
            System.out.println("InnerClass의 staticF(): " + staticVar2);
            //System.out.println("InnerClass의 instanceF(): " + score); 사용불가
            //System.out.println("InnerClass의 instanceF(): " + OuterClass.this.score); 사용불가
        }
    }

    static class StaticInnerClass {
        String instanceVar2 = "StaticInnerClass의 instanceVar";
        static String staticVar2 = "StaticInnerClass의 staticVar";

        String score = "이백점"; //외부 score변수와 충돌!!

        void instanceF() {
            //외부 변수 접근 가능
            //System.out.println("OuterClass의 instanceF(): " + instanceVar); 사용불가
            System.out.println("OuterClass의 instanceF(): " + staticVar);

            //내부 변수 접근 가능
            System.out.println("StaticInnerClass의 instanceF(): " + instanceVar2);
            System.out.println("StaticInnerClass의 instanceF(): " + staticVar2);
            System.out.println("StaticInnerClass의 instanceF(): " + score); //내부 score
            //System.out.println("InnerClass의 instanceF(): " + OuterClass.this.score); 사용 불가
        }

        static void staticF() {
            //instance 생성없이 사용하므로 static만 가능

            //System.out.println("OuterClass의 instanceF(): " + instanceVar); 사용불가
            System.out.println("OuterClass의 staticF(): " + staticVar);

            //System.out.println("InnerClass의 instanceF(): " + instanceVar2); 사용불가
            System.out.println("StaticInnerClass의 staticF(): " + staticVar2);
            //System.out.println("InnerClass의 instanceF(): " + score); 사용불가
            //System.out.println("InnerClass의 instanceF(): " + OuterClass.this.score); 사용불가
        }
    }
}