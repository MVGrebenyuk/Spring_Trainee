package com.geekbrains.spring.context.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CartService cartServece1 = context.getBean("cartService", CartService.class);
        cartServece1.addProduct(2);
        cartServece1.addProduct(3);
        cartServece1.showProducts();
        cartServece1.removeProduct(2);
        cartServece1.showProducts();
        CartService cartServece2 = context.getBean("cartService", CartService.class);
        cartServece2.addProduct(4);
        cartServece1.showProducts();
        cartServece2.showProducts();
        context.close();
    }
}
