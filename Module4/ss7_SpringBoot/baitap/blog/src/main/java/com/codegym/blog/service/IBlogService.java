package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);
    void remove(Integer id);
    Blog findById(Integer id);
}
