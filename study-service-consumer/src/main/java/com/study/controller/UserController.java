package com.study.controller;

import com.study.pojo.User;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: UserController
 * @Description:
 * @date: 2021/11/21
 * @author zhb
 */
@RestController
@RequestMapping("consumer/user")
public class UserController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    // 包含了拉取服务的所有信息
    private DiscoveryClient discoveryClient;

    @GetMapping
    public User queryUserById(@RequestParam("id") Long id){
        // 根据服务名创建服务实例
        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
        ServiceInstance instance = instances.get(0);
        return this.restTemplate.getForObject("http://"+ instance.getHost() +":"+ instance.getPort() +"/user/" + id,User.class);
    }

}
