package com.hujian.spring.spel;

/**
 * Created by hujian on 2016/10/8.
 */
public class Car {
    private String brand;
    private double price;
    //轮胎的周长
    private double tyreperimeter;

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

    public double getTyreperimeter() {
        return tyreperimeter;
    }

    public void setTyreperimeter(double tyreperimeter) {
        this.tyreperimeter = tyreperimeter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", tyreperimeter=" + tyreperimeter +
                '}';
    }
}
