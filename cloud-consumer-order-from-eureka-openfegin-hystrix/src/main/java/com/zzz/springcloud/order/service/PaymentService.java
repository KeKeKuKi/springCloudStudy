package com.zzz.springcloud.order.service;

import com.zzz.cloud.common.common.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "CLOUD-PROVIDER-PYMENT-FOR-EUREKA-HYSTRIX", path = "/payment")
public interface PaymentService {

    @GetMapping("/list")
    CommonResult<Object> list();

    @GetMapping("/listSometimesError")
    CommonResult<Object> listSometimesError();
}
