package com.hujian.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hujian on 2016/10/8.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans_autowire.xml");
        Person person= (Person) context.getBean("person");
        System.out.println(person);
    }
}
