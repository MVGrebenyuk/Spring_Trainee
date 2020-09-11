package com.geekbrains.spring.context.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    public List<Product> cartList = new ArrayList<>();
    private ProductReprository productReprository;

    public void init (){
    }

    public void addProductForCartById(int id){
        Product prod = productReprository.findProductByID(id);
        cartList.add(prod);
    }

    public void removeProductByID(int id){
        for(Product prod: cartList){
            if(prod.getId() == id){
                cartList.remove(prod);
            }
        }

    }

    @Autowired
    public void setProductReprository(ProductReprository productReprository) {
        this.productReprository = productReprository;
    }
}
