package com.hujian.spring.relation;

import com.hujian.spring.autowire.Address;
import com.hujian.spring.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hujian on 2016/10/8.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans_relation.xml");
        Address address= (Address) context.getBean("address");
        System.out.println(address);

        address= (Address) context.getBean("address2");
        System.out.println(address);

        Person person= (Person) context.getBean("person");
        System.out.println(person);
    }
}
