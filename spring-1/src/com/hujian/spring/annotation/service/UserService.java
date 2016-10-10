package com.hujian.spring.annotation.service;

import com.hujian.spring.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hujian on 2016/10/10.
 */
@Service
public class UserService {


    private UserRepository userRepository;
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(){
        System.out.println("UserService add...");
        userRepository.save();
    }
}
