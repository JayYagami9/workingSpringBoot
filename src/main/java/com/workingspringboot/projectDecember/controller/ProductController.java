package com.workingspringboot.projectDecember.controller;

import com.workingspringboot.projectDecember.model.Product;
import com.workingspringboot.projectDecember.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //RequestMapping("/getAllProducts")
    @RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Product getProductById(@PathVariable int id){

        return  productService.getProductById(id);
    }

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

}
