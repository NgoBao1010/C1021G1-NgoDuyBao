package service.impl;

import model.Category;
import repository.CategoryRepo;
import repository.impl.CategoryRepoImpl;

import java.util.List;

public class CategoryServiceImpl implements CategoryRepo {
    CategoryRepo categoryRepo = new CategoryRepoImpl();
    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }
}
