package com.workingspringboot.projectDecember.service;

import com.workingspringboot.projectDecember.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> allProducts = new ArrayList<>(Arrays.asList(
            new Product(101, "iPhone", 120000),
            new Product(102, "Monitor", 30000),
            new Product(103, "MacBook", 320000),
            new Product(104, "Table", 12000),
            new Product(105, "Pen", 200)));

    public List<Product> getAllProducts(){
        return allProducts;
    }

    public Product getProductById(int id){
        return allProducts.stream()
                .filter(p -> p.getId() == id)
                .findFirst().get();
    }

    public  void addProduct(Product product){
        allProducts.add(product);
    }

    public void updateProduct(Product product) {
        int index = -1;
        for(int i=0; i<allProducts.size(); i++){
            if(allProducts.get(i).getId() == product.getId()){
                index = i;
                break;
            }
        }
        if(index != -1)
            allProducts.set(index, product);
    }

    public void deleteProduct(int prodId) {
        int index = -1;
        for(int i=0; i<allProducts.size(); i++) {
            if (allProducts.get(i).getId() == prodId) {
                index = i;
                break;
            }
        }
            if(index != -1)
                allProducts.remove(index);

    }
}
