package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.study.springcloud.mapper")
@EnableDiscoveryClient // 启动eureka客户端
public class StudyServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyServiceProviderApplication.class, args);
    }

}
