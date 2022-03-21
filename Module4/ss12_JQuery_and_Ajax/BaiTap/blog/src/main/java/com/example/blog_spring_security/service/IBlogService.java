package com.example.blog_spring_security.service;

import com.example.blog_spring_security.model.Blog;


import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();
    void save(Blog blog);
    Optional<Blog> findById(Long id);

    void remove(Blog blog);
    List<Blog> searchBySummary(String summary);
}
