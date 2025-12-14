package com.workingspringboot.projectDecember.service;

import com.workingspringboot.projectDecember.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> allProducts = Arrays.asList(new Product(101, "iPhone", 120000));

    public List<Product> getAllProducts(){
        return allProducts;
    }
}
