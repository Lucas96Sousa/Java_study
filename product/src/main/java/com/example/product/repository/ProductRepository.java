package com.example.product.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.product.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

  private List<Product> products = new ArrayList<Product>();
  private Integer lastId = 0;

  /**
   * This method return a products list
   * 
   * @return Return all content in product list
   */

  public List<Product> getAll() {
    return products;
  }

  /**
   * Method to return search product by Id
   * 
   * @param id product to be search
   * @return Return id to product search
   **/
  
  public Optional<Product> getById(Integer id) {
    return products
        .stream()
        .filter(product -> product.getId() == id)
        .findFirst();
  }

}
