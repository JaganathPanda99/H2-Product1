package com.example.ProductUsageH2.h2_demo.controller;


import com.example.ProductUsageH2.h2_demo.model.Product1;
import com.example.ProductUsageH2.h2_demo.repository.ProductInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Product1")
public class Product1Controller {

    private final ProductInterface productInterface;

    public Product1Controller(ProductInterface productInterface) {
        this.productInterface = productInterface;
    }

    @GetMapping("/findAll")
    public Iterable<Product1> findAllProducts(){
        Iterable<Product1> all = productInterface.findAll();
        return all;
    }

}
