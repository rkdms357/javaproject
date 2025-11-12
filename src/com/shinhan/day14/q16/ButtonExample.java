package com.shinhan.day14.q16;

class Button {
    ClickListener clickListener;

    @FunctionalInterface
    public static interface ClickListener {
        void onClick();
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}

public class ButtonExample {
    public static void main(String[] args) {
        f5();
    }

    private static void f5() {
        Button btnOK = new Button();
        btnOK.setClickListener(() -> System.out.println("Ok 버튼을 클릭했습니다."));
        btnOK.click();

        Button btnOK2 = new Button();
        btnOK2.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));

        //원래는 이런 모양
//		btnOK2.setClickListener(new Button.ClickListener() {
//
//			@Override
//			public void onClick() {
//				// TODO Auto-generated method stub
//
//			}
//		});
        btnOK2.click();
    }
}