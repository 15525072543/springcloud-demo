package com.study;

import com.netflix.ribbon.http.HttpResourceGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ClassName: RibbonLoadBalanceTest
 * @Description: 负载均衡测试类
 * @date: 2021/12/19
 * @author zhb
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RibbonLoadBalanceTest {

    @Resource
    private RibbonLoadBalancerClient client;

    @Test
    public void test(){
        for (int i = 0; i < 50; i++) {
            ServiceInstance instance = this.client.choose("service-provider");
            System.out.println(instance.getHost() + ":" + instance.getPort());
        }
    }
}
