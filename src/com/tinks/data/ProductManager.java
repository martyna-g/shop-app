package com.tinks.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductManager {

    private Product product;
    private Review review;

    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        product = new Food(id, name, price, rating, bestBefore);
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
        product = new Drink(id, name, price, rating);
        return product;
    }
}
