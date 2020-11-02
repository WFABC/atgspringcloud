package com.wangfu.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: atgspringcloud
 * @description: 主启动类
 * @author: fu
 * @create: 2020-09-21
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerMain83 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain83.class,args);
    }
}
