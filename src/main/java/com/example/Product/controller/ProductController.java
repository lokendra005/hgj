package com.example.Product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Product.dto.FakeStoreDto;
import com.example.Product.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProductController {
    ProductService ps;

    ProductController(ProductService ps) {
        this.ps = ps;
    }

    @GetMapping("/products/")
    public FakeStoreDto[] getAllProducts() {
        return ps.getAllProducts();
    }

    @GetMapping("/products/{id}/")
    public FakeStoreDto getProductsById(@PathVariable long id) {
        return ps.getProductsById(id);
    }

}
