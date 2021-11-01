package com.study.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration //声明一个类是一个java配置类，相当于一个xml配置文件
//@PropertySource("classpath:jdbc.properties") //读取资源文件
@EnableConfigurationProperties(JdbcProperties.class) //使使用 @ConfigurationProperties 注解的类生效。
public class JdbcConfigration {

    //第一种注入方式：通过注解进行注入
//    @Autowired
//    private JdbcProperties jdbcProperties;

    //第二种注入方式：通过构造方法进行注入
//    private JdbcProperties jdbcProperties;
//    public JdbcConfigration(JdbcProperties jdbcProperties){
//        this.jdbcProperties = jdbcProperties;
//    }

    @Bean
//    @ConfigurationProperties(prefix = "jdbc") //第三种注入方式：直接在方法上添加@ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(JdbcProperties jdbcProperties){ //第四种注入方式：通过方法的入参进行注入
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;
    }
}
