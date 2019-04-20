package com.enda.spring_cloud_admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wt
 * @Date: 2019/4/20 18:07
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class SpringCloudAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAdminApplication.class, args);
    }
}
