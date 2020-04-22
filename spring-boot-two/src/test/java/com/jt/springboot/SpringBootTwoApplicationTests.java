package com.jt.springboot;

import com.jt.springboot.dao.UserMapper;
import com.jt.springboot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootTwoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testFind(){
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
    }

    @Test
    public void insert(){
        User user = new User();
        user.setName("妲己").setAge(18).setSex("女");
        userMapper.insert(user);
    }

}
