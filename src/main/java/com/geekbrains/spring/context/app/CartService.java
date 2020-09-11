package com.geekbrains.spring.context.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CartService {
    private Cart cart;

    @Autowired
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void addProduct(int id){
        cart.addProductForCartById(id);
    }

    public void showProducts(){
        System.out.println(cart.cartList);
    }

    public void removeProduct(int id){
        cart.removeProductByID(id);
    }

}
