package com.jt.springboot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jt.springboot.dao")
public class SpringBootTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTwoApplication.class, args);
    }

}
