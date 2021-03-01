package com.codegym.service.product;

import com.codegym.model.Category;
import com.codegym.model.Product;


public interface ProductService {
    Iterable<Product> findAll();

    Product findById(Long id);


    void remove(Long id);

    void save(Product product);

    Iterable<Product> findAllByCategory(Category category);
}
