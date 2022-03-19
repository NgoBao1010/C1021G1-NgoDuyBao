package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IBlogService {
    List<Blog> findAll();
    void save(Blog blog);
    void remove(Integer id);
    Blog findById(Integer id);
}
