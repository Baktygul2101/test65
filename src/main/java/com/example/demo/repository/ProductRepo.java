package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    public Optional<Product> findByName(String s);


    @Query(value = "SELECT * FROM products WHERE name = :name", nativeQuery = true)
    List<Product> findAllByName(@Param("name") String name);

}