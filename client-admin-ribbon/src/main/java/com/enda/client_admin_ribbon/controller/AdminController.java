package com.enda.client_admin_ribbon.controller;

import com.enda.client_admin_ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wt
 * @create 2019-04-08 下午8:18
 */
@RestController
@EnableDiscoveryClient
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping(value = "sayHello")
    public String sayHello(@RequestParam String name) {
        return adminService.sayHello(name);
    }
}
