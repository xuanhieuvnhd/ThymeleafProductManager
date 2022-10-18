package com.service;

import com.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    private static int size = 1;

    static {
        products = new HashMap<>();
        products.put(size++, new Product(1, "Iphone 14", "6.7 inch", "Apple", 10));
        products.put(size++, new Product(2, "Iphone 8", "5.5 inch", "Apple", 20));
        products.put(size++, new Product(3, "Iphone X", "4.7 inch", "Apple", 40));
        products.put(size++, new Product(4, "Iphone 11", "5.5 inch", "Apple", 22));
        products.put(size++, new Product(5, "Iphone 11 Max", "6.3 inch", "Apple", 33));
        products.put(size++, new Product(6, "Iphone Plus", "6.3 inch", "Apple", 19));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void add(Product product) {
        products.put(size++, product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public ArrayList<Product> findByName(String name) {
        List<Product> searchList = new ArrayList<>();

        for (Product product : findAll()
        ) {
            if (product.getName().contains(name)) {
                searchList.add(product);
            }else {
                System.err.println("Khong tim thay");
            }
        }
        return (ArrayList<Product>) searchList;
    }
}
