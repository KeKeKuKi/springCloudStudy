package com.zzz.springcloud.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: TestController
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1515:44
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/a")
    public String helloa() throws InterruptedException {
//        Thread.sleep(2000);
        return "-------hello - A";
    }

    @GetMapping("/b")
    public String hellob(){
        return "-------hello - B";
    }

    @GetMapping("/c")
    @SentinelResource(value = "c", blockHandler = "cExceptionHandler")
    public String helloc(@RequestParam(value = "p1",required = false) String p1,
                         @RequestParam(value = "p2",required = false) String p2){
        return "-------hello - C";
    }
    public String cExceptionHandler(String p1, String p2, BlockException e){
        return "-------sorry! -  -_-\"" + e.getMessage();
    }
}
