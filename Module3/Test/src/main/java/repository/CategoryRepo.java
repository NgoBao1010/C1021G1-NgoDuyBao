package repository;

import model.Category;
import model.Product;

import java.util.List;

public interface CategoryRepo {
    List<Category> findAll();
}
