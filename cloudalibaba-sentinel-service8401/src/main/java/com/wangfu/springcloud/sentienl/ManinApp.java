package com.wangfu.springcloud.sentienl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: atgspringcloud
 * @description: 主启动类
 * @author: fu
 * @create: 2020-10-19
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ManinApp {
    public static void main(String[] args) {
        SpringApplication.run(ManinApp.class,args);
    }
}
