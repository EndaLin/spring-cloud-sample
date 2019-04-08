package com.enda.client_admin_feign.controller;

import com.enda.client_admin_feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wt
 * @create 2019-04-08 下午9:32
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping(value = "sayHello")
    public String sayHello(@RequestParam String name) {
        return adminService.sayHello(name);
    }
}
