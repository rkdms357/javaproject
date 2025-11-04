package com.shinhan.day09;

import java.util.Objects;

//import lombok.EqualsAndHashCode;

//@EqualsAndHashCode
public class Car {
    private String model;
    private int price;
    private String color;

    public Car() {
        super();
    }

    public Car(String model, int price, String color) {
        super();
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", price=" + price + ", color=" + color + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) return false;
        Car newCar = (Car) obj;
        return model.equals(newCar.model) && price == newCar.price;
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }
}