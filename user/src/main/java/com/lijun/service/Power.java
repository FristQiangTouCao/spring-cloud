package com.lijun.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author weed
 * @date 2020/8/19 0019 10:57
 * @description
 */
//@feign(name = "POWER")
public interface Power {

    @RequestMapping("/hello/test")
    public Object get();
 }
