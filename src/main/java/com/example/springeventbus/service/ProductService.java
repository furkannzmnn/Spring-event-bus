package com.example.springeventbus.service;

import com.example.springeventbus.event.CreateOrderEvent;
import com.example.springeventbus.model.Product;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ProductService  {

    @EventListener(condition = "#event.eventType == T(com.example.springeventbus.event.EventType).CREATE")
    public void orderProduct(CreateOrderEvent event) {
        Product product = new Product("name", "description", 10.0);
        System.out.println(event.getEventType());
    }

    @EventListener(condition = "#event.eventType == T(com.example.springeventbus.event.EventType).UPDATE")
    public void updateProduct(CreateOrderEvent event) {
        Product product = new Product("name", "description", 10.0);
        System.out.println(event.getEventType());
    }

    @EventListener(condition = "#event.eventType == T(com.example.springeventbus.event.EventType).DELETE")
    public void deleteProduct(CreateOrderEvent event) {
        Product product = new Product("name", "description", 10.0);
        System.out.println(event.getEventType());
    }

}
