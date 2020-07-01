package com.wangfu.payment8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.wangfu.payment8001.mapper")
@EnableEurekaClient
public class Payment8002 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8002.class,args);
    }
}
