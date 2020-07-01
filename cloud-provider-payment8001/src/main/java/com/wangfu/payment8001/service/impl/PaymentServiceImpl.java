package com.wangfu.payment8001.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.wangfu.api.entity.Payment;
import com.wangfu.payment8001.mapper.PaymentMapper;
import com.wangfu.payment8001.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @program: atgspringcloud
 * @description: paymentservice
 * @author: fu
 * @create: 2020-06-10
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Payment getPayment(Long id) {
        QueryWrapper<Payment> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        Payment payment=paymentMapper.selectOne(queryWrapper);
        return payment;
    }
}
