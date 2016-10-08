package com.hujian.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hujian on 2016/9/25.
 */
public class Main {
    public static void main(String[] args){

//        HelloWorld helloWorld= new HelloWorld();
//        helloWorld.setName("hujian");

        //1.创建Spring的IOC容器对象
        //ApplicationContext表示IOC容器
        //ClassPathXmlApplicationContext: 是ApplicationContext 接口的一个实现类，该实现类从类路径下来加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
         //2.从IOC容器中获取Bean实例
        //HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloWorld");
        HelloWorld helloWorld=ctx.getBean(HelloWorld.class);
        System.out.println(helloWorld);
        helloWorld.hello();

        Car car= (Car) ctx.getBean("car");
        System.out.println(car);

        car=(Car) ctx.getBean("car2");
        System.out.println(car);

        Person person=(Person) ctx.getBean("person");
        System.out.println(person);

        com.hujian.spring.collections.Person person1= (com.hujian.spring.collections.Person) ctx.getBean("person3");
        System.out.println(person1);

        NewPerson newPerson= (NewPerson) ctx.getBean("newPerson");
        System.out.println(newPerson);

        DataSource dataSource= (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource.getProperties());


    }
}
