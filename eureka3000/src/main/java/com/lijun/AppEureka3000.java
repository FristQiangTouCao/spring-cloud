package com.lijun;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author weed
 * @date 2020/8/13 0013 14:07
 * @description
 */
@EnableEurekaServer
@SpringBootApplication
public class AppEureka3000 {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka3000.class);
    }
}
