package com.lijun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weed
 * @date 2020/8/17 0017 11:30
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class AppPower2 {

    public static void main(String[] args) {
        SpringApplication.run(AppPower2.class);
    }


}
