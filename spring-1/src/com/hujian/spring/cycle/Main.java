package com.hujian.spring.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hujian on 2016/10/9.
 */
public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans_cycle.xml");
        Car car= (Car) context.getBean("car");
        System.out.println(car);
        context.close();
    }
}
