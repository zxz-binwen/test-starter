package com.spring.boot.starter.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.boot.starter.entity.User;
import com.spring.boot.starter.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService extends ServiceImpl<UserMapper, User> {


    @Transactional
    public User add(String name, Integer age) {

        User user = new User();
        user.setAge(age);
        user.setName(name);

        save(user);

        return user;
    }
}
