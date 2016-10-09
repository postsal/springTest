package com.hujian.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;


/**
 * Created by hujian on 2016/10/8.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_properties.xml");
        DataSource dataSource= (DataSource) context.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }
}
