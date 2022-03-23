//package com.codegym.case_study_spring.configuration;
//
//import com.codegym.case_study_spring.service.MyUserDetailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private MyUserDetailService myUserDetailService;
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    /*Cài đặt cách lấy thông tin UserDetail, cơ chế mã hoá password*/
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(myUserDetailService)
//                .passwordEncoder(passwordEncoder());
//    }
//
//    /*Cấu hình xác thực/phân quyền theo cơ chế HTTP basic*/
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .formLogin()
//                .defaultSuccessUrl("/homepage").permitAll()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/homepage").permitAll()
//                .anyRequest().authenticated();
//    }
//}
