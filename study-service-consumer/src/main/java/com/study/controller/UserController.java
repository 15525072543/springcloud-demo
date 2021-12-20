package com.study.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.study.client.UserClient;
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
// @DefaultProperties(defaultFallback = "fallBackMethod")
public class UserController {

    @Resource
    private UserClient userClient;

    @GetMapping
    public String  queryUserById(@RequestParam("id") Long id){
        return userClient.queryUserById(id).toString();
    }



    // ----未使用feign组件之前写法-------------------------------------------------

    // @Resource
    // private RestTemplate restTemplate;

    // @Resource
    // 包含了拉取服务的所有信息
    // private DiscoveryClient discoveryClient;

    // @GetMapping
    // @HystrixCommand // 标记该方法需要被熔断
    // public String queryUserById(@RequestParam("id") Long id){
    //     // 根据服务名创建服务实例
    //     // List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
    //     // ServiceInstance instance = instances.get(0);
    //     return this.restTemplate.getForObject("http://service-provider/user/" + id,String.class);
    // }

    // /**
    //  * 熔断方法
    //  * 返回值要和被熔断的方法返回值一致
    //  * 熔断方法不需要参数
    //  */
    // public String fallBackMethod(){
    //     return "老子忙着呢！！！！！";
    // }

}
