package com.example.demo.model;

import lombok.*;
import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    public static final Product EMPTY =new Product() ;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 128)
    private String name;
    @Column(length = 128)
    private String image;
    @Column
    private Integer count;
    @Column(length = 128)
    private String description;
    @Column
    private float price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}