package com.enda.client_admin_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 通过 @EnableFeignClients 注解开启 Feign 功能
 * @author wt
 * @create 2019-04-08 下午9:18
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ClientAdminFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientAdminFeignApplication.class, args);
    }
}
