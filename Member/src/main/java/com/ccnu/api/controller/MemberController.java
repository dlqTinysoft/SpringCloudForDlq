package com.ccnu.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * created by 董乐强 on 2019/4/15
 */

@RestController
public class MemberController {

    /**
     * 采用配置中心，会员服务调用订单服务
     * @return
     */

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/getMember")
    public String getMember(){
        String orderUrl = "http://app-itmayiedu-order/getOrder";
        String result = restTemplate.getForObject(orderUrl,String.class);
        return result;
    }
}
