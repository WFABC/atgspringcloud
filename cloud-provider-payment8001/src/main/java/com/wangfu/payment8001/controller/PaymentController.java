package com.wangfu.payment8001.controller;


import com.wangfu.api.entity.CommonResult;
import com.wangfu.api.entity.Payment;
import com.wangfu.payment8001.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: atgspringcloud
 * @description: 支付controller
 * @author: fu
 * @create: 2020-06-10
 **/
@RestController
@RequestMapping("/payment")
public class PaymentController {


    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPayment/{id}")
    public CommonResult getPayment(@PathVariable Long id ){
        Payment result=paymentService.getPayment(id);
        return new CommonResult(200,"成功"+port,result);
    }

}
