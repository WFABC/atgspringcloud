package com.wangfu.springcloud.consumer.service;

import com.wangfu.api.entity.CommonResult;
import com.wangfu.api.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "nacos-payment-provider",fallback = ConsumerFallbackService.class)
public interface ConsumerService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
