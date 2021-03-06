package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 启动eureka服务器
public class StudyServiceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyServiceEurekaApplication.class, args);
    }

}
