package com.example.crudapi.controller;

import com.example.crudapi.Entity.Product;
import com.example.crudapi.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

//    @GetMapping("/greeting")
//    public String greetMessage(){
//        return "Greetings";
//    }
    @Autowired
    ProductService productService;
    @GetMapping(name = "/greeting")
    public Product saveProduct(@RequestBody Product productInput){
        return productService.save(productInput);
    }
}
