package com.zzz.springcloud.payment.controller;

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

    @GetMapping("discovery")
    public CommonResult<Object> discovery(){
        List<String> services = discoveryClient.getServices();
        services.forEach(i -> {
            log.debug("***********" + i);
        });

        return new CommonResult<>().ofSuccess(this.discoveryClient);
    }


    @GetMapping("list")
    public CommonResult<Object> list() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return new CommonResult<>().ofSuccess(paymentService.list());
    }
}
