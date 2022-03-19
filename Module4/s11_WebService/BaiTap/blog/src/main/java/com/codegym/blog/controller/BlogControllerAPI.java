package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogControllerAPI {
    @Autowired
    private IBlogService blogService;

    @GetMapping
    public ResponseEntity<List<Blog>> showBlog(){
        List<Blog> blogPage = blogService.findAll();
        if (blogPage == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogPage,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> showById(@PathVariable Integer id){
        Blog blog = blogService.findById(id);
        if(blog == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Blog> create(@RequestBody Blog blog){
        ResponseEntity.ok(blog.getBlogName());
        blogService.save(blog);
        return new ResponseEntity<>(blog,HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Blog> save(@RequestBody Blog blog){
        blogService.save(blog);
       return new ResponseEntity<>(blog,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> update(@PathVariable Integer id,@RequestBody Blog blog){
        Blog blogs = blogService.findById(id);
        if (blogs == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogs.setBlogName(blog.getBlogName());
        blogs.setContent(blog.getContent());
        blogs.setBlogDescription(blog.getBlogDescription());
        blogs.setCategory(blog.getCategory());
        blogService.save(blog);
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Blog> delete(@PathVariable Integer id){
        Blog blog = blogService.findById(id);
        if (blog == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogService.remove(id);
        return new ResponseEntity<>(blog,HttpStatus.NO_CONTENT);
    }
}
