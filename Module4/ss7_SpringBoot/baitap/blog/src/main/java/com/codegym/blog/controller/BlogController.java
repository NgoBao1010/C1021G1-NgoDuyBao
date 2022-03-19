package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.repository.ICategoryRepository;
import com.codegym.blog.service.IBlogService;
import com.codegym.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;
    @GetMapping("/list")
    public ModelAndView showList (@PageableDefault(value = 4) Pageable pageable){
        Page<Blog> blogList = blogService.findAll(pageable);

        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("blogList",blogList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createForm (){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blog",new Blog());
        modelAndView.addObject("categoryList",categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        return "redirect:/list";
    }
    @GetMapping("/edit-blog/{id}")
    public ModelAndView editForm(@PathVariable int id){
        Blog blog = blogService.findById(id);
        if (blog == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("edit");
            modelAndView.addObject("blog",blog);
            return modelAndView;
        }
    }
    @PostMapping("/edit")
    public String update(@ModelAttribute("blog")Blog blog){
        blogService.save(blog);
        return "redirect:/list";
    }
    @GetMapping("/view-blog/{id}")
    public String viewBlog(@PathVariable int id,Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog",blog);
        return "view";
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView deleteForm(@PathVariable int id){
        Blog blog = blogService.findById(id);
        if (blog == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("delete");
            modelAndView.addObject("blog",blog);
            return modelAndView;
        }
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute("blog") Blog blog){
        blogService.remove(blog.getId());
        return "redirect:/list";
    }
}
