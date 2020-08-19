package com.ruleConfig;

import com.lijun.config.MyRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;

/**
 * @author weed
 * @date 2020/8/19 0019 10:37
 * @description
 */
@Configuration
public class MyRuleConfiguration {

    @Bean
    public IRule getRule() {
        return new MyRule();
    }
}
