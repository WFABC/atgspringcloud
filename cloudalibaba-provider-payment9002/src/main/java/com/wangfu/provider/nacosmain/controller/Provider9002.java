package com.wangfu.provider.nacosmain.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: atgspringcloud
 * @description: contro
 * @author: fu
 * @create: 2020-09-21
 **/
@RestController
@RequestMapping("/payment")
public class Provider9002 {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "Hello Nacos Discovery: " + serverPort + "\t id: " + id;
    }
}
