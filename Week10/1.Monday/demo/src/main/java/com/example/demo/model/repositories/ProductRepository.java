package com.example.demo.model.repositories;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    public List<Product> getAllProducts(){
        Product product1 = new Product("Vinyl", 10);
        Product product2 = new Product("Earth Wind and Fire", 25);
        Product product3 = new Product("Metallica", 15);
        Product product4 = new Product("Playboi Vinyl", 50);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        return productList;
    }
}
