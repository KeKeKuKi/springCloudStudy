package com.zzz.springcloud.order.service;

import com.zzz.cloud.common.common.CommonResult;
import com.zzz.springcloud.order.service.failback.PaymentServicFailBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(
        value = "CLOUD-PROVIDER-PYMENT-FOR-EUREKA-HYSTRIX",
        path = "/payment",
        fallback = PaymentServicFailBack.class)
public interface PaymentService {

    @GetMapping("/list")
    CommonResult<Object> list();

    @GetMapping("/listSometimesError")
    CommonResult<Object> listSometimesError();

    @GetMapping("/fuseTestfuseTest/{id}")
    public CommonResult<String> fuseTest(@PathVariable("id") Integer id);
}
