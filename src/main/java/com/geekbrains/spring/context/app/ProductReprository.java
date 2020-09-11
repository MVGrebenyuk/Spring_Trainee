package com.geekbrains.spring.context.app;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ProductReprository {

    private List<Product> list;

    @PostConstruct
    public void init (){
        list = new ArrayList<Product>(Arrays.asList(
                new Product(1, "Bread", "100"),
                new Product(2, "IceCream", "100"),
                new Product(3, "PineApple", "100"),
                new Product(4, "Peach", "100"),
                new Product(5, "Cocowotch", "100")
        ));
    }

    public List<Product> findAll(){
        return Collections.unmodifiableList(list);
    }

    public Product findProductByID(int id) {
        for (Product prod : list) {
            if (prod.getId() == id) {
                return prod;
            }
        }
        return null;
    }

    public void addProduct(Product prod){
        list.add(prod);
    }
}
