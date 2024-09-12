package com.example.ProductUsageH2.h2_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class modelProduct2 {

    @Id
    Integer id;
    String  userName;
    String  ProductName;
    Integer  NumOfItems;
//
}
