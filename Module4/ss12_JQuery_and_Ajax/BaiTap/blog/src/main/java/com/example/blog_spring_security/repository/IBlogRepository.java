package com.example.blog_spring_security.repository;

import com.example.blog_spring_security.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Long> {
    List<Blog> searchBySummary(String summary);
}
