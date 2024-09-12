package com.example.ProductUsageH2.h2_demo.model;


import org.springframework.data.annotation.Id;


public record Product1(@Id Integer id, String title, String Category, String Brand ){


}