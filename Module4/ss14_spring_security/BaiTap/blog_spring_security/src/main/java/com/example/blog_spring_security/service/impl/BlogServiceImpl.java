package com.example.blog_spring_security.service.impl;

import com.example.blog_spring_security.model.Blog;
import com.example.blog_spring_security.repository.IBlogRepository;
import com.example.blog_spring_security.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;
    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Integer id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog findById(Integer id) {
       return blogRepository.findById(id).get();
    }
}
