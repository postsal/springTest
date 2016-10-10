package com.hujian.spring.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hujian on 2016/10/10.
 */
public class BaseService<T> {

    @Autowired
    protected BaseRepository<T> repository;

    public void add(){
        System.out.println("add...");
        System.out.println(repository);
    }
}
