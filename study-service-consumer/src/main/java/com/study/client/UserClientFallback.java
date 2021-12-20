package com.study.client;

import com.study.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserClientFallback
 * @Description:
 * @date: 2021/12/21
 * @author zhb
 */
@Component
public class UserClientFallback implements UserClient{

    @Override
    public User queryUserById(Long id) {
        User user = new User();
        user.setName("老子忙着呢！！！！");
        return user;
    }
}
