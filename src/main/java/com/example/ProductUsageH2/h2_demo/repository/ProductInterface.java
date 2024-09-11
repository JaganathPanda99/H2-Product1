package com.example.ProductUsageH2.h2_demo.repository;

import com.example.ProductUsageH2.h2_demo.model.Product1;
import org.springframework.data.repository.CrudRepository;

public interface ProductInterface extends CrudRepository<Product1, Integer> {
}
