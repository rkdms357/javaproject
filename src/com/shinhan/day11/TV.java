package com.shinhan.day11;

public class TV {
    String company;
    int price;

    public TV(String company, int price) {
        super();
        this.company = company;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TV [company=").append(company).append(", price=").append(price).append("]");
        return builder.toString();
    }
}