package com.wangfu.consumer.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: atgspringcloud
 * @description: 主启动类
 * @author: fu
 * @create: 2020-07-06
 **/
@SpringBootApplication
@EnableFeignClients
public class OpenFeign {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeign.class,args);
    }
}
