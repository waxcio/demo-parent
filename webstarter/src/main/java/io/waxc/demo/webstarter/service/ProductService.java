package io.waxc.demo.webstarter.service;


import io.waxc.demo.webstarter.model.Product;

import java.util.Collection;

public interface ProductService {
    public abstract void createProduct(Product product);

    public abstract void updateProduct(String id, Product product);

    public abstract void deleteProduct(String id);

    public abstract Collection<Product> getProducts();
}