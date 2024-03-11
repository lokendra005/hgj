package com.example.Product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ArticleController {
    @Autowired
    ProductService ps;

    @GetMapping("/article/")
    public String getAllArticles() {
        return ps.getAllArticle();
    }

}
