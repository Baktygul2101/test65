package com.example.demo.controller;


import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepo;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductRepo productRepo;
    @Autowired
    CategoryRepo categoryRepo;


    @GetMapping
    public String showProducts (Model model) {
        model.addAttribute("products", productRepo.findAll());
        return "index";
    }
    @GetMapping("/")
    @ResponseBody
    public Iterable<Product> getProdList() {
        return productRepo.findAll();
    }


    @RequestMapping("/jql/{name}")
    public String getMainPageJql(Model model, @PathVariable("name") String name) {
        model.addAttribute("categories", categoryRepo.getByName(name));
        return "index";
    }

}
