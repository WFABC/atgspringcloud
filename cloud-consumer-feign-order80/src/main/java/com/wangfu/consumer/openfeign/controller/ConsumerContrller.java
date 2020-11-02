package com.wangfu.consumer.openfeign.controller;

import com.wangfu.api.entity.CommonResult;
import com.wangfu.api.entity.Payment;
import com.wangfu.consumer.openfeign.service.ConsumerOpenFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: atgspringcloud
 * @description: 消费
 * @author: fu
 * @create: 2020-07-06
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerContrller {

    @Resource
    private ConsumerOpenFeign consumerOpenFeign;

    @GetMapping("/getPayment/{id}")
    public CommonResult getPayment(@PathVariable Long id ){
        return consumerOpenFeign.getPayment(id);
    }
}
