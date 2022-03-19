package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import com.codegym.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogServiceImpl implements IBlogService{

    @Autowired
    private IBlogRepository iblogRepository;
    @Override
    public List<Blog> findAll() {
        return iblogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        iblogRepository.save(blog);
    }

    @Override
    public void remove(Integer id) {
        iblogRepository.deleteById(id);
    }

    @Override
    public Blog findById(Integer id) {
        return iblogRepository.findById(id).get();
    }
}
