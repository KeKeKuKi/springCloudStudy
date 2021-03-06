package com.zzz.springcloud.order.controller;

import com.zzz.cloud.common.common.CommonResult;
import com.zzz.springcloud.order.service.PaymentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer1")
public class OrderFeignController {

    @Resource
    PaymentService paymentService;

    @RequestMapping("/payment/list1")
    CommonResult<Object> list(){
        return paymentService.list();
    }
}
