package com.shinhan.day05;

//class : 틀(template)
//Object == instance(실체)
public class Computer {

    //1. 필드(non-static(인스턴스 변수), static(클래스 변수))
    //[Modifier] 변수타입 변수이름
    //Modifier 접근권한 : public > protected < 생략(default) < private(이 클래스내에서만 사용가능. 정보은닉임~)
    //Modifier 활용방법 : static, final

    //public > protected > 생략 > private
    //public : 모든 패키지내에서 접근 가능
    //protected : 같은 패키지에서 접근 가능, 다른 패키지에서는 상속받으면 가능
    //생략 : 같은 패키지내에서만 접근 가능
    //private : 해당 class내에서만 접근 가능

    private String model;
    private int price;

    //static(클래스 변수), non-static(인스턴스 변수)
    //final : 마지막이라는 의미, 수정불가!!
    private static int cnt;

    //static final(상수라는 뜻) : class 변수, 수정불가
    //선언시에 static block에서 초기화함
    static final String COMPANY = "삼성";
    static final String COMPANY2;

    //선언시에 생성자, instance block에서 초기화함. 수정은 불가~
    final int speed = 100;
    final int speed2;
    final int speed3;
    private final int speed4;

    int getSpeed4() {
        return speed4;
    }

    static { //여기서 초기화가능
        COMPANY2 = "신한";
    }

    {
        speed3 = 300;
        speed4 = 400;
    }

    //2. 생성자(constructor).. 초기화가 목적!!, 오버로딩이 지원됨
    //[Modifier 접근권한, 활용방법] 클래스이름
    public Computer() {
        this(null, 0);
    }

    public Computer(String model) {
        this(model, 0);
    }

    public Computer(String model, int price) {
        this.model = model;
        this.price = price;
        speed2 = 200;
    }

    //3. 메서드
    //Getter, Setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        price += 2000;
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getCnt() {
        return cnt;
    }

    //4. instance block
    //5. static block
}