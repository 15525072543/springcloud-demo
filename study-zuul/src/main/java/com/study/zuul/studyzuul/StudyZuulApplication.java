package com.study.zuul.studyzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // 启用zuul组件
@EnableDiscoveryClient
public class StudyZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyZuulApplication.class, args);
    }

}
