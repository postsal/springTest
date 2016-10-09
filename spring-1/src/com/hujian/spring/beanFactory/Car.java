package com.hujian.spring.beanFactory;

/**
 * Created by hujian on 2016/10/9.
 */
public class Car {
    private String brand;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Car() {
        System.out.println("Car's contructor.....");
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}
