package com.study.client;

import com.study.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: UserClient
 * @Description: User远程调用接口
 * @date: 2021/12/21
 * @author zhb
 */
// 声明一个接口是feign接口  value：调用服务的服务名 fallback：熔断的实现类
@FeignClient(value = "service-provider",fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("user/{id}")
    public User queryUserById(@PathVariable("id")Long id);
}
