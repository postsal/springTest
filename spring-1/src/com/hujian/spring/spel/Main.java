package com.hujian.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hujian on 2016/10/8.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans_spel.xml");
        Address address= (Address) context.getBean("address");
        System.out.println(address);

        Car car= (Car) context.getBean("car");
        System.out.println(car);

        Person person= (Person) context.getBean("person");
        System.out.println(person);
    }
}
