package com.jt.springboot.service.impl;

import com.jt.springboot.dao.UserMapper;
import com.jt.springboot.pojo.User;
import com.jt.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
