package com.wangfu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: atgspringcloud
 * @description: z主启动类
 * @author: fu
 * @create: 2020-06-16
 **/
@SpringBootApplication
@EnableEurekaServer
public class Eurekamain7002 {
    public static void main(String[] args) {
        SpringApplication.run(Eurekamain7002.class,args);
    }
}
