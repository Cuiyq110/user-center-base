package com.cuiyq.usercenterbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cuiyq.usercenterbase.mapper")
public class UserCenterBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterBaseApplication.class, args);
    }

}
