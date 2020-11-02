package com.wangfu.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: atgspringcloud
 * @description: 主启动类
 * @author: fu
 * @create: 2020-10-22
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class AppMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(AppMain9003.class,args);
    }
}
