package com.project.mall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.project.mall.ware.dao")
public class MallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallWareApplication.class, args);
    }
}
