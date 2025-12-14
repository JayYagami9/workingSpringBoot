package com.workingspringboot.projectDecember.model;

import org.springframework.stereotype.Component;

@Component
public class Product {


    private int id;
    private String productName;
    private int price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    public Product() {
    }

    public Product(int id, String productName, int price) {
        this.price = price;
        this.productName = productName;
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
