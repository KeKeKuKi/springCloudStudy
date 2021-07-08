package com.zzz.springcloud.order.service;

import com.zzz.cloud.common.common.CommonResult;
import com.zzz.springcloud.order.service.failback.PaymentServicFailBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(
        value = "CLOUD-PROVIDER-PYMENT-FOR-EUREKA",
        path = "/payment",
        fallback = PaymentServicFailBack.class)
public interface PaymentService {

    @GetMapping("/list")
    CommonResult<Object> list();

    @GetMapping("/listSometimesError")
    CommonResult<Object> listSometimesError();
}
