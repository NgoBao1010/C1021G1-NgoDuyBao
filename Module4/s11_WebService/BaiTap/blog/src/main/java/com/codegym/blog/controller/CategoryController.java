package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> categoryList = categoryService.findAll();
        if (categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Integer id){
        Category category = categoryService.findById(id);
        if (category == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(category,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Category> create(@RequestBody Category category){
        ResponseEntity.ok(category.getNameCategory());
        categoryService.save(category);
        return new ResponseEntity<>(category,HttpStatus.CREATED);
    }

//    @PostMapping
//    public ResponseEntity<Category> save(@RequestBody Category category){
//        categoryService.save(category);
//        return new ResponseEntity<>(category,HttpStatus.CREATED);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> update(@PathVariable Integer id,@RequestBody Category category){
        Category categorys = categoryService.findById(id);
        if (categorys == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        categorys.setNameCategory(category.getNameCategory());
        categorys.setBlogs(category.getBlogs());
        categoryService.save(categorys);
        return new ResponseEntity<>(categorys,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Category> delete(@PathVariable Integer id){
        Category category = categoryService.findById(id);
        if (category == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        categoryService.remove(id);
        return new ResponseEntity<>(category,HttpStatus.NO_CONTENT);
    }
}
