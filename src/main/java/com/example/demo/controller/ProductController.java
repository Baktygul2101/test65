package com.example.demo.controller;


import com.example.demo.repository.CategoryRepo;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductRepo repo;
    @Autowired
    CategoryRepo categoryRepo;

    @RequestMapping("/")
    public String getMainPage(Model model) {
        model.addAttribute("categories", categoryRepo.findAll());
        return "index";
    }

    @RequestMapping("/jql/{name}")
    public String getMainPageJql(Model model, @PathVariable("name") String name) {
        model.addAttribute("categories", categoryRepo.getByName(name));
        return "index";
    }

}
