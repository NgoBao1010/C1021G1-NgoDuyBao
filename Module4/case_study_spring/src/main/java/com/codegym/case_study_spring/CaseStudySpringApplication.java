package com.codegym.case_study_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CaseStudySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaseStudySpringApplication.class, args);
    }

}
