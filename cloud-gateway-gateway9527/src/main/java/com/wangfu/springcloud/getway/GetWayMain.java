package com.wangfu.springcloud.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: atgspringcloud
 * @description: 主启动类
 * @author: fu
 * @create: 2020-09-02
 **/
@SpringBootApplication
@EnableEurekaClient
public class GetWayMain {

    public static void main(String[] args) {
        SpringApplication.run(GetWayMain.class,args);
    }
}
