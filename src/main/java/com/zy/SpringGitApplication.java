package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.zy.mapper")
@SpringBootApplication
public class SpringGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGitApplication.class, args);
    }

}

