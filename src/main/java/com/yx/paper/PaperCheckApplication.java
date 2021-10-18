package com.yx.paper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyc.springboot.dao")
public class PaperCheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaperCheckApplication.class, args);
    }

}
