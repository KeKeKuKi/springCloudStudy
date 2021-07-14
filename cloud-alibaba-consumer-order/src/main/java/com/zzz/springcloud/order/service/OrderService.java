package com.zzz.springcloud.order.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "payment-provider-nacos",path = "/payment")
public interface OrderService {

    @GetMapping("/hello")
    String hello();
}
