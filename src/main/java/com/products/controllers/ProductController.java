package com.products.controllers;

import com.products.domain.entity.Product;
import com.products.services.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class ProductController {

  private final IProductService productService;

  @GetMapping("/products")
  public ResponseEntity<List<Product>> findAllProducts() {
    return new ResponseEntity<>(this.productService.findAll(), HttpStatus.OK);
  }

  @PostMapping("/products")
  public ResponseEntity<Product> save(@RequestBody Product product) {
    return new ResponseEntity<>(this.productService.save(product), HttpStatus.CREATED);
  }

  @GetMapping("/products/{productId}")
  public ResponseEntity<Product> save(@PathVariable("productId") String productId) {
    return new ResponseEntity<>(this.productService.findById(productId), HttpStatus.OK);
  }
}
