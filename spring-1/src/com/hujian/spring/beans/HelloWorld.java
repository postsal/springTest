package com.hujian.spring.beans;

/**
 * Created by hujian on 2016/9/25.
 */
public class HelloWorld {
    private String name;

    public void setName2(String name){
        this.name=name;
    }

    public void hello(){
        System.out.println("hello:"+ name);
    }
}
