package com.zzz.springcloud.order.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zzz.cloud.common.common.CommonResult;
import com.zzz.springcloud.order.service.PaymentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  例子仅用于测试，正常使用为以上controller操作
 */
@RestController
@RequestMapping("/consumer")
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentService paymentService;

    @Override
    public CommonResult<Object> list() {
        // 超时控制，ribbon默认1秒钟超时，开启超时控制在yml配置中
        return paymentService.list();
    }

    @Override
    public CommonResult<Object> listSometimesError() {
        return paymentService.listSometimesError();
    }

}
