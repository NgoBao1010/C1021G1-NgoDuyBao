package service.impl;

import model.Product;
import repository.CategoryRepo;
import repository.DBConnection;
import repository.ProductRepo;
import repository.impl.CategoryRepoImpl;
import repository.impl.ProductRepoImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductRepo {
    ProductRepo productRepo = new ProductRepoImpl();
    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public void create(Product product) {
        productRepo.create(product);
    }

    @Override
    public void delete(int id) {
        productRepo.delete(id);
    }

    @Override
    public void updateProduct(Product product) {
        productRepo.updateProduct(product);
    }

    @Override
    public Product selectProduct(int id) {
        return productRepo.selectProduct(id);
    }

    @Override
    public List<Product> search(String name) {
        return productRepo.search(name);
    }
}
