package com.wangfu.paymenthystrix.service.impl;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wangfu.paymenthystrix.service.PaymentHystrixService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @program: atgspringcloud
 * @description: 业务层
 * @author: fu
 * @create: 2020-08-04
 **/
@Service
public class PaymentHystrixServiceImpl implements PaymentHystrixService {

    @Override
    public String hystrixOk(String id) {
        return "线程池"+Thread.currentThread().getName()+"正常访问"+id;
    }


    @HystrixCommand(fallbackMethod = "hystrixTimeOut_handler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    @Override
    public String hystrixTimeOut(String id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (Exception e){
            e.getMessage();
        }
        return "线程池"+Thread.currentThread().getName()+"超时访问"+id;
    }




    public String hystrixTimeOut_handler(String id){
        return "线程池"+Thread.currentThread().getName()+"服务超市或者程序报错";
    }

    /**
     * 服务熔断
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),              //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),    //请求数达到后才计算
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //休眠时间窗
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),  //错误率达到多少跳闸
    })
    @Override
    public String paymentCircuitBreaker(Integer id) {
        if (id<0){
            throw  new RuntimeException("不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return  Thread.currentThread().getName() + "\t" + "调用成功，流水号：" + serialNumber;

    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id 不能为负数,请稍后再试， o(╥﹏╥)o id: " + id;
    }
}
