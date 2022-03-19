package repository;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductRepo {
    List<Product> findAll();
    void create(Product product);
    void delete(int id);
    void updateProduct (Product product);
    Product selectProduct(int id);
    List<Product> search(String name);
}
