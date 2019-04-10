package com.enda.client_admin_ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wt
 * @create 2019-04-08 下午8:14
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 在 Ribbon 调用方法上增加 @HystrixCommand 注解并指定 fallbackMethod 熔断方法
     */
    @HystrixCommand(fallbackMethod = "sayHelloError")
    public String sayHello(String name) {
        return restTemplate.getForObject("http://service-admin/admin?name=" + name, String.class);
    }

    public String sayHelloError(String name) {
        return String.format("Your message is %s, but request error.", name);
    }
}
