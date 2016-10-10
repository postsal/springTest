package com.hujian.spring.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * 持久化层
 * Created by hujian on 2016/10/10.
 */
@Repository(value = "userRepository")
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserRepository Save...");
    }
}
