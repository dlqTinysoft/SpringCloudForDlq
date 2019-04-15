package com.ccnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * created by 董乐强 on 2019/4/15
 */

@SpringBootApplication
@EnableEurekaClient
public class Member {

    public static void main(String[] args) {
        SpringApplication.run(Member.class,args);
    }

    @Bean
    @LoadBalanced
        //开启本地负载均衡
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
