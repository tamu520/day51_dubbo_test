package com.itheima.service.impl;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserImpl implements UserService {
    @Autowired
    private UserService userService;

    @Override
    public List<User> findAll() {
    	//1
        return userService.findAll();
    }
}
