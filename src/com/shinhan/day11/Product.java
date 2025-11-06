package com.shinhan.day11;

public class Product<K, M> {
    K kind;
    M model;

    public Product(K kind, M model) {
        super();
        this.kind = kind;
        this.model = model;
    }

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Product [kind=").append(kind).append(", model=").append(model).append("]");
        return builder.toString();
    }
}