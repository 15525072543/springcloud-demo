package com.study.controller;

import com.study.pojo.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController{

    @Autowired
    private UserService userService;

    @GetMapping("test")
    @ResponseBody
    public String test(){
        return "hello user";
    }

    @GetMapping("{id}")
    @ResponseBody
    public User queryUser(@PathVariable("id") Long id){
        return this.userService.queryUserById(id);
    }

    @GetMapping("all")
    public String toUsers(Model model){
        List<User> users = this.userService.queryUserAll();
        model.addAttribute("users", users);
        return "users";
    }

}
