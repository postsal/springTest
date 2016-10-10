package com.hujian.spring.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hujian on 2016/10/10.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans_generic.xml");
        UserService userService= (UserService) context.getBean("userService");
        userService.add();
    }
}
