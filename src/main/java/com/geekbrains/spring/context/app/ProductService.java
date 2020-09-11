package com.geekbrains.spring.context.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    private ProductReprository productReprository;

    public List<Product> findAll(){
        return productReprository.findAll();
    }

    public void addProduct(Product prod){
        productReprository.addProduct(prod);
    }

    @Autowired // injection
    public void setProductReprository(ProductReprository productReprository) {
        this.productReprository = productReprository;
    }
}
