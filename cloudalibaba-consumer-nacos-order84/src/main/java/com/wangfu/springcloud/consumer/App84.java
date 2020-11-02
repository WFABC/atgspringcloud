package com.wangfu.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: atgspringcloud
 * @description: 主启动类
 * @author: fu
 * @create: 2020-10-22
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class App84 {
    public static void main(String[] args) {
        SpringApplication.run(App84.class,args);
    }
}
