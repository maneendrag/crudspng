package com.example.crudapi.Services.impl;

import com.example.crudapi.Entity.Product;
import com.example.crudapi.Services.ProductService;
import com.example.crudapi.repository.ProuctRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl(ProuctRepository prouctRepository) {
        this.prouctRepository = prouctRepository;
    }

    private ProuctRepository prouctRepository;
    @Override
    public Product save(Product productInput) {
        return prouctRepository.save(productInput);
    }

    @Override
    public Product findById(Long id) {
        return prouctRepository.findById(id).get();
    }


}
