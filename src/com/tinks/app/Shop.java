package com.tinks.app;

import com.tinks.data.*;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Shop {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();

        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now().plusDays(2));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
