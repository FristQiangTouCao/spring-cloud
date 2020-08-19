package com.lijun;

import com.ruleConfig.MyRuleConfiguration;
import com.ruleConfig.RandomConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author weed
 * @date 2020/8/15 0015 10:26
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClients({
        @RibbonClient(value = "POWER",configuration = MyRuleConfiguration.class),
        @RibbonClient(value = "ORDER",configuration = RandomConfiguration.class)
})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
