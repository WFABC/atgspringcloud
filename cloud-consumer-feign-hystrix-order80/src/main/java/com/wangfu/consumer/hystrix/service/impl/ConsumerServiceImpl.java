package com.wangfu.consumer.hystrix.service.impl;

import com.wangfu.consumer.hystrix.service.ConsumerService;
import org.springframework.stereotype.Component;

/**
 * @program: atgspringcloud
 * @description: 服务降级 fallback
 * @author: fu
 * @create: 2020-08-26
 **/
@Component
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentInfo_OK-----服务降级";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "paymentInfo_Timeout-----服务降级";
    }
}
