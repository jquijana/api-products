package com.products.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Accessors(chain = true)
@Document(collection = "products")
public class Product {

  @Id
  private String id;
  private String name;
  private String category;
  private Double price;
  private Boolean status;
}
