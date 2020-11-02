package com.wangfu.consumer.openfeign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: atgspringcloud
 * @description: openFeign日志
 * @author: fu
 * @create: 2020-07-06
 **/
@Configuration
public class openFeignLogConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
