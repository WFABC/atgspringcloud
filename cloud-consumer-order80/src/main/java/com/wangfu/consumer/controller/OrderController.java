package com.wangfu.consumer.controller;


import com.wangfu.api.entity.CommonResult;
import com.wangfu.api.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: atgspringcloud
 * @description: order-controller
 * @author: fu
 * @create: 2020-06-13
 **/
@RestController
@Slf4j
@RequestMapping("/consumerOrder")
public class OrderController {

    

    private static final  String URL="http://localhost:8001/payment";

    private static final String eurekeUrl="http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/getPayment/{id}")
    public CommonResult<Payment> getPayment(@PathVariable Long id){
        log.info("调用接口");
        log.info("");
        return restTemplate.getForObject(eurekeUrl+"/payment/getPayment/"+id,CommonResult.class);
    }
}
