package com.example.blog_spring_security.service.impl;


import com.example.blog_spring_security.model.MyUserDetail;
import com.example.blog_spring_security.model.User;
import com.example.blog_spring_security.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MyUserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private IUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("Tên đăng nhập không tồn tại.Vui lòng thử lại.");
        }
        return new MyUserDetail(user);
    }
}
