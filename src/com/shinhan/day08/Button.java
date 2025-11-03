package com.shinhan.day08;

//이 버튼의 동작을 구현클래스마다 다르게 하고자 함
public class Button {
    //내부(Inner, 중첩)인터페이스
    public static interface ClickListener {
        void onClick(); //앞에 public abstract생략됨
    }

    //field
    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void 클릭() {
        clickListener.onClick();
    }
}