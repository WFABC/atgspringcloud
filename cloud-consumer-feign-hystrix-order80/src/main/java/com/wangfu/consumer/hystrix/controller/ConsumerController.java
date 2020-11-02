package com.wangfu.consumer.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wangfu.consumer.hystrix.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: atgspringcloud
 * @description: 消费
 * @author: fu
 * @create: 2020-08-19
 **/
@RestController
@RequestMapping("/consumer")
@DefaultProperties(defaultFallback = "paymentInfo_Global_FallbackMethod")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return consumerService.paymentInfo_OK(id);
    };

//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000")
//    })
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id){
        return consumerService.paymentInfo_Timeout(id);
    };

    // 下面是全局fallback方法
    public String paymentInfo_Global_FallbackMethod() {
        return "Global异常处理信息，请稍后再试， /(ToT)/";
    }
    public String paymentInfo_TimeoutHandler(Integer id){
        return "调用服务或者自己出错";
    }
}
