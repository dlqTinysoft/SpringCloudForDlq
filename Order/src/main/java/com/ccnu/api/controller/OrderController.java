package com.ccnu.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by 董乐强 on 2019/4/15
 */

@RestController
public class OrderController {

    @Value("${server.port}")
    private String servicePort;

    @RequestMapping("/getOrder")
    public String getOrder(){

        return "获取订单信息"+servicePort;
    }
}
