package com.enda.service_admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author wt
 * @create 2019-04-08 下午7:19
 */
@RestController
public class ServiceAdminController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String SayHello(@RequestParam(value = "name")String message) {
        return String.format("hello, boss %s, i am from port: %s", message, port);
    }
}
