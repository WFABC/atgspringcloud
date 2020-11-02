package com.wangfu.rules;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @program: atgspringcloud
 * @description: Ribbon配置随机分配的类
 * @author: fu
 * @create: 2020-07-04
 **/
@Configuration
public class MyRules {

    @Bean
    public IRule MyRule(){
        return new RandomRule();
    }
}
