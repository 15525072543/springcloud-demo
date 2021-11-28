package com.study.controller;

import com.study.pojo.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

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

    @GetMapping
    public User queryUserById(@RequestParam("id") Long id){
        return this.restTemplate.getForObject("http://localhost:8081/user/" + id,User.class);
    }

}
