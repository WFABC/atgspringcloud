package com.wangfu.paymenthystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.PathVariable;

public interface PaymentHystrixService {
    /**
     * ok
     * @param id
     * @return
     */
    String hystrixOk(String id);

    /**
     * 超时访问
     * @param id
     * @return
     */

    String hystrixTimeOut(String id);



    String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
