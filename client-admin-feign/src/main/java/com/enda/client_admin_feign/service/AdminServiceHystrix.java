package com.enda.client_admin_feign.service;

import org.springframework.stereotype.Service;

/**
 * @Author: wt
 * @Date: 2019/4/10 9:54
 */
@Service
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHello(String name) {
        return String.format("Your name is %s, but request error", name);
    }
}
