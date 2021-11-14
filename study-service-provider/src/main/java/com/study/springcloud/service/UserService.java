package com.study.springcloud.service;

import com.study.springcloud.mapper.UserMapper;
import com.study.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * @ClassName: UserService
 * @Description:
 * @date: 2021/11/14
 * @author zhb
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }
}
