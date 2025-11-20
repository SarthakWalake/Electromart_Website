package com.electromart.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {
     @Id
    private String id;
    private String name;
    private String description;
    private String price;
    private String oldPrice;
    private String icon;
    private String category;
    private String badge;
    private double rating;
}
