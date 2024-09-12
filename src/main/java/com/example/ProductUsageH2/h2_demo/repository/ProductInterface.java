package com.example.ProductUsageH2.h2_demo.repository;

import com.example.ProductUsageH2.h2_demo.model.Product1;
//import com.example.ProductUsageH2.h2_demo.projections.ProductFewFields;
//import jdk.jfr.Category;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductInterface extends CrudRepository<Product1, Integer> {

}
