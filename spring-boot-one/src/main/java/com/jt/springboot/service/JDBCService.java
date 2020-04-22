package com.jt.springboot.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix="jdbc")//指定属性前缀
@Data//引入插件lombok 自动的set/get/构造方法插件
public class  JDBCService {
//    @Value("${jdbc.driver}") //spring中的spel表达式
    private String driver;
//    @Value("${jdbc.name}")
    private String name ;



    public void testService(){
        System.out.println(driver+ name);
    }


    //利用批量赋值时,需要使用set方法实行数据的赋值.
//    public String getDriver() {
//        return driver;
//    }
//
//    public void setDriver(String driver) {
//        this.driver = driver;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
