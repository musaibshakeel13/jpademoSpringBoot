package com.example.jpademo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public UserClassSpringBoot CreateUser(UserClassSpringBoot user) {
     return userRepository.save(user);
    }

    public UserClassSpringBoot UpdateUser(UserClassSpringBoot user) {
            return userRepository.save(user);
    }


    public List<UserClassSpringBoot> getUsers() {
        return userRepository.findAll();
    }
}
