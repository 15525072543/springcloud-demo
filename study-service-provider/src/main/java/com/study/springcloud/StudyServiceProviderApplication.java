package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.study.springcloud.mapper")
public class StudyServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyServiceProviderApplication.class, args);
    }

}
