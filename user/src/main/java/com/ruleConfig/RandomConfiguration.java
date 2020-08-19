package com.ruleConfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weed
 * @date 2020/8/19 0019 10:38
 * @description
 */
@Configuration
public class RandomConfiguration {

    @Bean
    public IRule getRule() {
        return new RandomRule();
    }
}
