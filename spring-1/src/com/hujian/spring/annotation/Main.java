package com.hujian.spring.annotation;

import com.hujian.spring.annotation.controller.UserController;
import com.hujian.spring.annotation.repository.UserRepositoryImpl;
import com.hujian.spring.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hujian on 2016/10/10.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_annotation.xml");
//        TestObject testObject = (TestObject) context.getBean("testObject");
//        System.out.println(testObject);

        UserController userController= (UserController) context.getBean("userController");
        System.out.println(userController);
        userController.execute();

//        UserService userService= (UserService) context.getBean("userService");
//        System.out.println(userService);

//        UserRepositoryImpl userRepository= (UserRepositoryImpl) context.getBean("userRepository");
//        System.out.println(userRepository);

    }
}
