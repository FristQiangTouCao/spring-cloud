
package com.lijun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author weed
 * @date 2020/8/19 0019 10:43
 * @description
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/test")
    public Object get() {
        return new HashMap<String,String>(){{
            put("msg","order1");
        }};
    }
}
