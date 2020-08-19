package com.lijun.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author weed
 * @date 2020/8/17 0017 11:25
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    private String url = "http://POWER";

    private String orderUrl = "http://ORDER";
    @RequestMapping("/power")
    public Object getPower() {
        Map forObject = restTemplate.getForObject(url + "/hello/test", Map.class);
        return forObject;
    }


    @RequestMapping("/order")
    public Object getOrder() {
        Map forObject = restTemplate.getForObject(orderUrl + "/order/test", Map.class);
        return forObject;
    }
}
