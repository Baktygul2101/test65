package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 128)
    private String name;
    @Column(length = 128)
    private String icon;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    @OrderBy("name ASC")
    List<Product> products;
}
