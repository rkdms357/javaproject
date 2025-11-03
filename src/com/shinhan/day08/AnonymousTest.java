package com.shinhan.day08;

public class AnonymousTest {
    int score = 99;

    public static void main(String[] args) {
        //f1();
        //f2();
        //f3();
        //f4();
    }

    private void f6() {
    }

    //로컬클래스는 바깐클래스의 필드와 메소드 사용 가능
    private void f5() {
        //final가진 매개변수나 로컬변수만 로컬클래스 내부에서 사용 가능
        final String name = "홍길동";
        //로컬클래스는 static클래스로 만들 수 없음
        class LocalCalss {
            void method() {
                System.out.println(score);
                f6();
                //name = "박길동"; 변경불가
                System.out.println(name);
            }
        }
    }

    private static void f4() {
        Button button = new Button();
        Button.ClickListener listener = new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("익명구현클래스의 메서드 구현...click하면 닫기");
            }
        };
        button.setClickListener(listener);
        button.클릭();

        button.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("익명구현클래스의 메서드 구현...click하면 열기");
            }
        });
        button.클릭();
    }

    private static void f3() {
        //여러번 쓸 수 있음. 변수에 담았으므로
//		Tire tire = new Tire() {
//
//			@Override
//			public void roll() {
//				System.out.println("익명구현클래스의 매서드를 구현");
//			}};
//			work(tire);
        work(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명구현클래스의 매서드를 구현");
            }
        });
    }

    private static void f2() {
        //만들자 마자 실행. 일회성으로 사용.
        (new Tire() {
            @Override
            public void roll() {
                System.out.println("즉시실행 - 익명구현클래스의 메서드를 구현");
            }
        }).roll();
    }

    private static void f1() {
        //구현 클래스 이용
        work(new HankukTire());
        work(new KumhoTire());
    }

    //다형성 = 자동형변환 + override
    //사용법은 같지만 결과는 다름
    private static void work(Tire tire) {
        tire.roll();
    }
}