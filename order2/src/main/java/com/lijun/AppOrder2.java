package com.lijun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weed
 * @date 2020/8/19 0019 10:51
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class AppOrder2 {
    public static void main(String[] args) {
        SpringApplication.run(AppOrder2.class);
    }
}
