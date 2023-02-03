package com.example.crudapi.repository;

import com.example.crudapi.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProuctRepository extends CrudRepository<Product, Long> {
}
