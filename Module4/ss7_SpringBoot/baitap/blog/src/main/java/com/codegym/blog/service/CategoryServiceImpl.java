package com.codegym.blog.service;

import com.codegym.blog.model.Category;
import com.codegym.blog.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService{

    @Autowired
    ICategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepository.findAll();
    }
}
