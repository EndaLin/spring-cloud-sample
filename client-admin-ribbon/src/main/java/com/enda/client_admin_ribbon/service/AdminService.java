package com.enda.client_admin_ribbon.service;

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

    public String sayHello(String name) {
        return restTemplate.getForObject("http://service-admin/admin?name=" + name, String.class);
    }
}
