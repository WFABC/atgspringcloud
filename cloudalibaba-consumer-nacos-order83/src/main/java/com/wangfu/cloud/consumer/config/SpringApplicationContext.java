package com.wangfu.cloud.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: atgspringcloud
 * @description: 全局配置类
 * @author: fu
 * @create: 2020-09-21
 **/
@Configuration
public class SpringApplicationContext {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
