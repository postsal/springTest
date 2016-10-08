package com.hujian.spring.scope;

import com.hujian.spring.autowire.Address;
import com.hujian.spring.autowire.Car;
import com.hujian.spring.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hujian on 2016/10/8.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_scope.xml");
        Car car = (Car) context.getBean("car");
        Car car1 = (Car) context.getBean("car");
        System.out.println(car == car1);
    }
}
