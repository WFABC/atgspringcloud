package com.wangfu.paymenthystrix.controller;

import com.wangfu.paymenthystrix.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: atgspringcloud
 * @description: controller
 * @author: fu
 * @create: 2020-08-04
 **/
@RestController
@Slf4j
@RequestMapping("/payment/hystrix")
public class PaymentHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/ok/{id}")
    public String hystrixOk(@PathVariable("id") String id){
        String result=paymentHystrixService.hystrixOk(id);
        log.info("result =>{}"+result);
        return result;
    }

    @GetMapping("/timeout/{id}")
    public String hystrixTimeOut(@PathVariable("id") String id){
        String result=paymentHystrixService.hystrixTimeOut(id);
        log.info("result =>{}"+result);
        return result;
    }

    @GetMapping("/breake/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String result=paymentHystrixService.paymentCircuitBreaker(id);
        log.info("result =>{}"+result);
        return result;
    }
}
