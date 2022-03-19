package com.codegym.repository.impl;

import com.codegym.model.Login;
import com.codegym.model.User;
import com.codegym.repository.ILoginRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class LoginRepositoryImpl implements ILoginRepository {
    private static List<User> userList = new ArrayList<>();
    static {
        User u1 = new User();
        u1.setAccount("duybao");
        u1.setPassword("101095");
        u1.setName("Duy Bảo");
        u1.setEmail("ngobao1010@gmail.com");
        u1.setAge(27);
        userList.add(u1);

        User u2 = new User();
        u2.setAccount("duylinh");
        u2.setPassword("29101993");
        u2.setName("Duy Linh");
        u2.setEmail("duylinh2910@gmail.com");
        u2.setAge(29);
        userList.add(u2);

        User u3 = new User();
        u3.setAccount("duythuan");
        u3.setPassword("29102003");
        u3.setName("Duy Linh");
        u3.setEmail("duylinh2910@gmail.com");
        u3.setAge(29);
        userList.add(u3);
    }
    @Override
    public User checkLogin(Login login) {
        for (User user: userList){
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
