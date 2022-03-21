package com.example.blog_spring_security.service.impl;

import com.example.blog_spring_security.model.Blog;
import com.example.blog_spring_security.repository.IBlogRepository;
import com.example.blog_spring_security.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void remove(Blog blog) {
        iBlogRepository.delete(blog);
    }

    @Override
    public List<Blog> searchBySummary(String summary) {
        return iBlogRepository.searchBySummary(summary);
    }
}
