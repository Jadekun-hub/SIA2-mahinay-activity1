package com.example.demo;

import com.example.demo.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductContoller {
    @GetMapping("/products")
    public List<Product> getProducts() {
        // Creating dummy products for testing
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Laptop", 999.99));
        products.add(new Product(2L, "Phone", 599.99));

        return products;
    }
}
