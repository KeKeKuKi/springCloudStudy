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
@DefaultProperties(defaultFallback = "defaultFallback")
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentService paymentService;


    @HystrixCommand(fallbackMethod = "listHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })
    @Override
    public CommonResult<Object> list() {
        // 超时控制，ribbon默认1秒钟超时，开启超时控制在yml配置中
        return paymentService.list();
    }
    public CommonResult<Object> listHandler() {
        // 超时控制，ribbon默认1秒钟超时，开启超时控制在yml配置中
        return CommonResult.ofSuccess("调用服务超时，服务降级");
    }


    @Override
    public CommonResult<Object> listSometimesError() {
        return paymentService.listSometimesError();
    }


    public CommonResult<Object> defaultFallback() {
        return CommonResult.ofSuccess("调用服务超时，全局服务降级统一处理");
    }
}
