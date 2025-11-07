package com.shinhan.day10;

import java.util.Objects;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
public class Car {
    String model;
    int price;
    String color;

    public Car(String color, int price, String model) {
        this.color = color;
        this.price = price;
        this.model = model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        return Objects.equals(color, other.color) && Objects.equals(model, other.model) && price == other.price;
    }

    String getCarInfo() {
        return "카의 정보";
    }
}