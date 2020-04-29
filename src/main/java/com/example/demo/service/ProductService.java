package com.example.demo.service;


import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepo repository;

    public ProductService(ProductRepo repository) {
        this.repository = repository;
    }

    public Product getById(Integer productId) {
        return repository.findById(productId).orElse(Product.EMPTY);
    }
}