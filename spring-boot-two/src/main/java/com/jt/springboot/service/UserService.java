package com.jt.springboot.service;

import com.jt.springboot.dao.UserMapper;
import com.jt.springboot.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}

