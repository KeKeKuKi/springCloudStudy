package com.zzz.springcloud.order.controller;

import com.zzz.springcloud.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: OrderController
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1417:33
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {

    @Resource
    OrderService orderService;

    @GetMapping("/hello")
    String hello(){
        return orderService.hello();
    }
}
