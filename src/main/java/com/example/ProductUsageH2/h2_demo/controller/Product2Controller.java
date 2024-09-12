package com.example.ProductUsageH2.h2_demo.controller;


import com.example.ProductUsageH2.h2_demo.model.modelProduct2;
import com.example.ProductUsageH2.h2_demo.repository.repoProduct2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Product2")
public class Product2Controller {

    private repoProduct2 product2;

    @GetMapping("/findAll")
    public List<modelProduct2> findAllProducts(){
        List<modelProduct2> all = product2.findAll();
        return all;
    }
}
