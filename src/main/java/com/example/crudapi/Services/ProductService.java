package com.example.crudapi.Services;

import com.example.crudapi.Entity.Product;

public interface ProductService {
    Product save(Product productInput);
    Product findById(Long id);

}
