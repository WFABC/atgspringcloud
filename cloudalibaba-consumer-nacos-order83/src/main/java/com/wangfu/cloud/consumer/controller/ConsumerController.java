package com.wangfu.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: atgspringcloud
 * @description: 消费之
 * @author: fu
 * @create: 2020-09-21
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/payment//nacos/{id}")
    public String consumer(@PathVariable("id") Integer id){
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }
}
