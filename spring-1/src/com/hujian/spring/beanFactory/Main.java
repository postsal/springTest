package com.hujian.spring.beanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hujian on 2016/10/9.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans_factory.xml");
        Car car1= (Car) context.getBean("car1");
        System.out.println(car1);
    }
}
