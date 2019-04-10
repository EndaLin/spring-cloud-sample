package com.enda.client_admin_feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wt
 * @create 2019-04-08 下午9:29
 */
@FeignClient(value = "service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping(value = "admin")
    String sayHello(@RequestParam String name);
}
