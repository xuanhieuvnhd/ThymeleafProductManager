package com.service;

import com.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void add(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void remove(int id);
    ArrayList<Product> findByName(String name);
}
