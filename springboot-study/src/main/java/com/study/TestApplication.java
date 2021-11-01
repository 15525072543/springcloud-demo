package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot的引导类
 */
//@EnableAutoConfiguration 启用Springboot应用的自动配置
//@ComponentScan 类似于<context:conponent-scan base-package=""> 扫描该类所在的包以及它的子子孙孙包
//@SpringBootConfiguration 相当于一个@Configuration
@SpringBootApplication //组合注解：相当于 @ConponmentScan @EnableAotuConfiguration @SpringbootConfiguration
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
    }
}
