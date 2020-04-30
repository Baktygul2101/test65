package com.example.demo.repository;

import com.example.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

    @Query("select p from Category as p where p.name like CONCAT(:name, '%')")
    public List<Category> getByName(String name);


}