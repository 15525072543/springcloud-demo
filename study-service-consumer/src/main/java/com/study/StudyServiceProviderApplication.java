package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// @SpringBootApplication
// @EnableDiscoveryClient
// @EnableCircuitBreaker // 开启熔断
@SpringCloudApplication // 组合注解：相当于@SpringBootApplication @EnableDiscoveryClient @EnableCircuitBreaker
@EnableFeignClients // 启用feign组件
public class StudyServiceProviderApplication {

    /**
     * 注入远程调用类
     */
    // @Bean
    // @LoadBalanced
    // public RestTemplate restTemplate(){
    //     return new RestTemplate();
    // }

    public static void main(String[] args) {
        SpringApplication.run(StudyServiceProviderApplication.class, args);
    }

}
