package com.example.Product.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Product.dto.FakeStoreDto;

@Service
public class ProductService {

    RestTemplate restTemplate = new RestTemplate();

    String url = "https://fakestoreapi.com";

    public FakeStoreDto[] getAllProducts() {
        var response = restTemplate.getForObject(url + "/products/" , FakeStoreDto[].class);
        return response;
        }

    public FakeStoreDto getProductsById(long id) {
        var response = restTemplate.getForObject(url + "/products/" + id, FakeStoreDto.class);
        return response;
    }

    public String getAllArticle() {
        return "All Articles";
    }

}
