package com.geekbrains.spring.context.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("protorype")
public class Product {
    private int id;
    private String name;
    private String price;

    public Product() {
    }

    public Product(int i, String bread, String s) {
        this.id = i;
        this.name = bread;
        this.price = s;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
