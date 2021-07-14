package com.zzz.springcloud.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: PaymentController
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1417:05
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/hello")
    public String hello(){
        String uid = UUID.randomUUID().toString();
        return uid + "--port:" + serverPort;
    }
}
