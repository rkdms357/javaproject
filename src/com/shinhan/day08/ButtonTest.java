package com.shinhan.day08;

//버튼의 동작을 구현한 클래스
//구현클래스를 이름이 있는 클래스로 만듦
class CloseButtonAction implements Button.ClickListener {
    @Override
    public void onClick() {
        System.out.println("닫기를 누름!");
    }
}

class CloseButtonAction2 implements Button.ClickListener {
    @Override
    public void onClick() {
        System.out.println("창을 닫음!");
    }
}

public class ButtonTest {
    public static void main(String[] args) {
        //f1();
        //f2();
        f3();
    }

    private static void f3() {
        //익명구현클래스
        work(new Button(), new Button.ClickListener() {

            @Override
            public void onClick() {
                System.out.println("익명구현클래스의 메서드를 구현");
            }
        });
    }

    private static void f2() {
        //익명구현클래스
        Button.ClickListener aa = new Button.ClickListener() {

            @Override
            public void onClick() {
                System.out.println("익명구현클래스의 메서드를 구현");
            }
        };
        work(new Button(), aa);
    }

    private static void f1() {
        Button closeButton = new Button();
//		closeButton.setClickListener(new CloseButtonAction());
//		closeButton.클릭();
//		closeButton.setClickListener(new CloseButtonAction2());
//		closeButton.클릭();
        work(closeButton, new CloseButtonAction());
        work(new Button(), new CloseButtonAction2());
    }

    private static void work(Button button, Button.ClickListener action) {
        button.setClickListener(action);
        button.클릭();
    }
}