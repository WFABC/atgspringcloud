package com.wangfu.consumer.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: atgspringcloud
 * @description: 主启动类
 * @author: fu
 * @create: 2020-08-19
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class applicationHystrix {
    public static void main(String[] args) {
        SpringApplication.run(applicationHystrix.class,args);
    }
}
