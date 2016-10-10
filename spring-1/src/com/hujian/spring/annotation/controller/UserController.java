package com.hujian.spring.annotation.controller;

import com.hujian.spring.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 表现层
 * Created by hujian on 2016/10/10.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void execute(){
        System.out.println("UserController execute...");
        userService.add();
    }
}
