package com.wangfu.consumer.openfeign.service;

import com.wangfu.api.entity.CommonResult;
import com.wangfu.api.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 */
@Component
@FeignClient(value = "cloud-payment-service")
public interface ConsumerOpenFeign {

    /**
     * openFegin
     * @param id
     * @return
     */
    @GetMapping("/payment/getPayment/{id}")
    public  CommonResult<Payment> getPayment(@PathVariable("id") Long id);

}
