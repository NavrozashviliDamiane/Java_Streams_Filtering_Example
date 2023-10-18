package org.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Sample products
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1000.0, "Electronics"),
                new Product("Headphones", 50.0, "Electronics"),
                new Product("Book", 20.0, "Stationery"),
                new Product("Shirt", 30.0, "Apparel"),
                new Product("Smartphone", 800.0, "Electronics")
        );

        // Filter products based on category (e.g., Electronics)
        List<Product> electronicsProducts = products.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .collect(Collectors.toList());

        // Print the filtered products
        System.out.println("Electronics Products:");
        electronicsProducts.forEach(System.out::println);
    }
}