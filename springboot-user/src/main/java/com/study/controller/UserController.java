package com.study.controller;

import com.study.pojo.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController{

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String test(){
        return "hello user";
    }

    @GetMapping("{id}")
    public User queryUser(@PathVariable("id") Long id){
        return this.userService.queryUserById(id);
    }
}
