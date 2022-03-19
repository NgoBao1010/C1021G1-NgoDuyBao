package com.codegym.blog.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String blogName;
    private String content;
    private String blogDescription;

    public Blog() {
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }

}
