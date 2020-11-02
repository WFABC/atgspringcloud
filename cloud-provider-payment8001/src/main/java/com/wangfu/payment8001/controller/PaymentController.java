package com.wangfu.payment8001.controller;



import com.wangfu.api.entity.CommonResult;
import com.wangfu.api.entity.Payment;
import com.wangfu.payment8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: atgspringcloud
 * @description: 支付controller
 * @author: fu
 * @create: 2020-06-10
 **/
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {


    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPayment/{id}")
    public CommonResult getPayment(@PathVariable Long id ){
        Payment result=paymentService.getPayment(id);
        return new CommonResult(200,"成功"+port,result);
    }

    @GetMapping("/getDiscovered")
    public DiscoveryClient getDiscover(){
        List<String> services = discoveryClient.getServices();
        for (String s:services){
            log.info(s);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance serviceInstance:instances){
            log.info(serviceInstance.getInstanceId()+" "+serviceInstance.getUri()+" "+serviceInstance.getHost()+" "+
                    serviceInstance.getPort());
        }
        return this.discoveryClient;
    }

}
