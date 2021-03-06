package com.example.blog_spring_security.controller;

import com.example.blog_spring_security.model.Blog;
import com.example.blog_spring_security.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/blog")
    public ResponseEntity<List<Blog>> showBlog(){
        List<Blog> blogPage = iBlogService.findAll();
        if (blogPage.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(blogPage,HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Blog>> showAllBlog(@PathVariable Long id){
        Optional<Blog> blogPage = iBlogService.findById(id);
        if (blogPage == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(blogPage,HttpStatus.OK);
        }
    }
    @GetMapping("/search")
    public ResponseEntity<List<Blog>> searchSumary(@RequestParam String summary){
        List<Blog> blogPage = iBlogService.searchBySummary(summary);
        if (blogPage.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogPage,HttpStatus.OK);

    }
}
