package com.wangfu.springcloud.consumer.service;

import com.wangfu.api.entity.CommonResult;
import com.wangfu.api.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @program: atgspringcloud
 * @description: fallback
 * @author: fu
 * @create: 2020-10-22
 **/
@Component
public class ConsumerFallbackService implements ConsumerService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，---PaymentFallbackService",new Payment(id,"ErrorSerial"));
    }
}
