package com.wangfu.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: atgspringcloud
 * @description: 公共返回实体类
 * @author: fu
 * @create: 2020-06-10
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{
    private Integer code;
    private String msg;
    private T      data;

    public CommonResult(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
