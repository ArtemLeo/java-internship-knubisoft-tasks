package com.knubisoft.base.queue.car;

public class Car {

    private final String brand;
    private final double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}
