package com.wangfu.springcloud.sentienl.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 *
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "----testB";
    }

    @GetMapping("/testHostKey")
    @SentinelResource(value = "testHostKey",blockHandler = "test_blockHandler")
    public String testHostKey(@RequestParam(value = "p1",required = false)String p1,
                              @RequestParam(value = "p2",required = false)String p2) {
        return "----testHostKey";
    }

    public String test_blockHandler(String p1,String p2,BlockException b){
        return "test_blockHandler";
    }
}
