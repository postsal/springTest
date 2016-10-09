package com.hujian.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hujian on 2016/10/9.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("beans_beanfactory.xml");
        Car car= (Car) context.getBean("car");
        System.out.println(car);
    }
}
