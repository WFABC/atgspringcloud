package com.wangfu.springcloud.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: atgspringcloud
 * @description: fegin
 * @author: fu
 * @create: 2020-10-22
 **/
@Configuration
public class ApplicationContextConfig {

    @LoadBalanced
    @Bean
    public RestTemplate getResTemplate(){
        return new RestTemplate();
    }
}
