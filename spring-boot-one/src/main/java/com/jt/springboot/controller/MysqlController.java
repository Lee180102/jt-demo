package com.jt.springboot.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//指定配置文件 进行加载
@PropertySource("classpath:/properties/mysql.properties")
@ConfigurationProperties(prefix="mysql")//指定属性前缀
@Data
public class MysqlController  {

//    @Value("${mysql.name}")
    private String name;
//    @Value("${mysql.driver}")
    private String driver;


    @RequestMapping("/getMsg")
    public String getMsg(){
        return name +driver+ "---OK!!!";
    }
}
