/**
 * 
 */
package com.javatechie.service;

import java.util.List;

import com.javatechie.dto.Product;

/**
 * 
 */
public interface ProductService {
    List<Product> getProducts();
    Product getProduct(int id);
}
