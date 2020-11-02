package com.wangfu.paymenthystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: atgspringcloud
 * @description: 主启动类
 * @author: fu
 * @create: 2020-08-04
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class hystrix {

    public static void main(String[] args) {
        SpringApplication.run(hystrix.class,args);
    }
}
