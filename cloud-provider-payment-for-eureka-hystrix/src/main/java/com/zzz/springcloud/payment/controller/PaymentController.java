package com.zzz.springcloud.payment.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zzz.cloud.common.common.CommonResult;
import com.zzz.springcloud.payment.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ZhaoZezhong
 * @since 2021-06-24
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    IPaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;


    @GetMapping("list")
    public CommonResult<Object> list() throws InterruptedException {
        //故意暂停3秒
        TimeUnit.SECONDS.sleep(3);
        return new CommonResult<>().ofSuccess(paymentService.list());
    }

    @HystrixCommand(fallbackMethod = "listSometimesErrorHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    @GetMapping("listSometimesError")
    public CommonResult<Object> listSometimesError() throws InterruptedException {
        if(Math.random() > 0.5){
            throw new RuntimeException("故意抛出的异常！");
        }
//        TimeUnit.SECONDS.sleep(5);
        return new CommonResult<>().ofSuccess(paymentService.list());
    }
    public CommonResult<Object> listSometimesErrorHandler() {
        return new CommonResult<>().ofSuccess("paymentService.list() 调用异常，降级响应！" ) ;
    }
}
