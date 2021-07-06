package com.products.services;

import com.products.domain.entity.Product;
import com.products.domain.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

  @Autowired private ProductRepository productRepository;

  @Override
  public List<Product> findAll() {
    return productRepository.findAll();
  }

  @Override
  public Product save(Product product) {
    return productRepository.save(product);
  }

  @Override
  public Product findById(String productId) {
    return productRepository.findById(productId).orElse(null);
  }
}
