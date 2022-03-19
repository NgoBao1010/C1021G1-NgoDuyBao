package com.example.blog_spring_security.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String blogName;
    private String content;
    private String blogDescription;

    public Blog() {
    }

    public Blog(int id, String blogName, String content, String blogDescription) {
        this.id = id;
        this.blogName = blogName;
        this.content = content;
        this.blogDescription = blogDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }
}
