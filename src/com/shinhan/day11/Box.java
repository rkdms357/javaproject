package com.shinhan.day11;

//import lombok.ToString;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//제네릭
//A, B타입은 사용시 구체적으로 결정할 것임 (아직 결정되지 않음)
//@ToString
//@Getter
//@Setter
//@AllArgsConstructor
public class Box<A, B> { //A, B는 들어올때 타입이 결정됨
    private A kind;
    private B size; //값이 10, small

    public Box<A, B> makeBox(A kind, B size) {
        return new Box<>(kind, size);
    }

    public Box(A kind, B size) {
        super();
        this.kind = kind;
        this.size = size;
    }

    public A getKind() {
        return kind;
    }

    public void setKind(A kind) {
        this.kind = kind;
    }

    public B getSize() {
        return size;
    }

    public void setSize(B size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Box [kind=").append(kind).append(", size=").append(size).append("]");
        return builder.toString();
    }
}