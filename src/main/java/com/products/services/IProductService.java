package com.products.services;

import com.products.domain.entity.Product;

import java.util.List;

public interface IProductService {

  List<Product> findAll();

  Product save(Product product);

  Product findById(String productId);
}
