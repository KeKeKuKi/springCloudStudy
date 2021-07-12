package com.zzz.springcloud.payment.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zzz.cloud.common.common.CommonResult;
import com.zzz.springcloud.payment.entity.Payment;
import com.zzz.springcloud.payment.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

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


    @GetMapping("/list")
    public CommonResult<List<Payment>> list() {
        //故意暂停3秒
//        TimeUnit.SECONDS.sleep(3);
        return CommonResult.ofSuccess(paymentService.list());
    }

    /**
     * 服务降级测试接口
     */
    @HystrixCommand(fallbackMethod = "listSometimesErrorHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    @GetMapping("/listSometimesError")
    public CommonResult<Object> listSometimesError() {
        if(Math.random() > 0.5){
            throw new RuntimeException("故意抛出的异常！");
        }
//        TimeUnit.SECONDS.sleep(5);
        return CommonResult.ofSuccess(paymentService.list());
    }
    public CommonResult<Object> listSometimesErrorHandler() {
        return CommonResult.ofSuccess("paymentService.list() 调用异常，降级响应！" ) ;
    }

    /**
     * 服务熔断接口
     */
    @HystrixCommand(fallbackMethod = "fuseTestFallBack", commandProperties = {
            // 时间窗口期内，请求次数失败次数比例达到多少百分比就熔断
            // 所有配置参数记录在 HystrixCommandProperties 类下
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), // 开启服务熔断
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"), // 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"), // 时间窗口
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60") // 失败率达到多少跳闸

    })
    @GetMapping("/fuseTestfuseTest/{id}")
    public CommonResult<String> fuseTest(@PathVariable("id") Integer id){
        String s = UUID.randomUUID().toString();
        if(id > 0){
            throw new RuntimeException(s + "调用失败！");
        }
        return CommonResult.ofSuccess(s + "服务正常");
    }
    public CommonResult<String> fuseTestFallBack(@PathVariable("id") Integer id){
        return CommonResult.ofSuccess("服务异常，服务降级");
    }

}
