package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void create(Product product);
    void delete(int id);
    void updateProduct(Product product);
    Product selectProduct(int id);
    List<Product> search(String name);
}
