package io.waxc.demo.webstarter.service;


import io.waxc.demo.webstarter.model.Product;

import java.util.Collection;

/**
 * demo for productservice
 */
public interface ProductService {
    void createProduct(Product product);

    void updateProduct(String id, Product product);

    void deleteProduct(String id);

    Collection<Product> getProducts();
}