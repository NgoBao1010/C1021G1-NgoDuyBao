package com.example.blog_spring_security.config;


import com.example.blog_spring_security.service.impl.MyUserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailServiceImpl myUserDetailService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailService).passwordEncoder(passwordEncoder());
//        auth.inMemoryAuthentication().withUser("user").password("abdclsmmt0906").roles("USER");
//        auth.inMemoryAuthentication().withUser("admin").password("abdclsmmt1010").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .formLogin()
                .defaultSuccessUrl("/list").permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/list").permitAll()
                .antMatchers("/create-new-blog","/view-blog/{id}").hasAnyRole("USER","ADMIN")
                .antMatchers("/delete-blog/{id}","/edit-blog/{id}").hasRole("ADMIN")
                .anyRequest().authenticated();
    }

}
