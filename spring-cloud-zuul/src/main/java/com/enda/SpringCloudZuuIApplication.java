package com.enda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootConfiguration
@EnableEurekaClient
@EnableZuulProxy
@EnableAutoConfiguration
public class SpringCloudZuuIApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringCloudZuuIApplication.class, args);
    }
}
