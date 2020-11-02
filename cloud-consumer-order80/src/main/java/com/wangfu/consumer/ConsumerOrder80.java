package com.wangfu.consumer;

import com.wangfu.rules.MyRules;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: atgspringcloud
 * @description: 主启动
 * @author: fu
 * @create: 2020-06-13
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(value = "CLOUD-PAYMENT-SERVICE",configuration = MyRules.class)
public class ConsumerOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrder80.class,args);
    }
}
