package com.lijun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author weed
 * @date 2020/8/17 0017 11:22
 * @description
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test")
    public Object test(){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("code",0);
        map.put("msg","OK!");
        map.put("data","power1,hello eureka");
        return map;
    }
}
