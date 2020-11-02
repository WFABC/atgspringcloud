package com.wangfu.api.entity;



import lombok.Data;

/**
 * @program: atgspringcloud
 * @description: 支付实体类
 * @author: fu
 * @create: 2020-06-10
 **/
@Data
public class Payment {
    private Long id;
    private String serial;

    public Payment(){

    }
    public Payment(Long id, String serial){
        this.id=id;
        this.serial=serial;
    }
}
