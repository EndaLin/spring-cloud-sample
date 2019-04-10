package com.enda.client_admin_ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author wt
 * @create 2019-04-08 下午7:52
 */
@SpringBootApplication
@EnableEurekaServer
@EnableHystrixDashboard
public class ClientAdminRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientAdminRibbonApplication.class, args);
    }
}
