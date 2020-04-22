package com.jt.springboot.controller;


import com.jt.springboot.service.JDBCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JDBCController {
    @Autowired
    private JDBCService jdbcService;

    @RequestMapping("/testJDBC")
    public String testJDBC(){
        jdbcService.testService();
        return "OK!!!";
    }
}
