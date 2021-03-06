package com.example.blog_spring_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BlogSpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogSpringSecurityApplication.class, args);

    }

}
