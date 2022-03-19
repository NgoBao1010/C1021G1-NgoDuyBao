package com.codegym.blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String blogName;
    private String content;
    private String blogDescription;

    @JsonBackReference
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
