package com.example.springeventbus.model;

import org.springframework.context.ApplicationEvent;

public record Product(String name, String description, double price) {
    public Product {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or blank");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("description cannot be null or blank");
        }
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be negative");
        }
    }
}
