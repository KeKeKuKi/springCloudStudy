package com.zzz.springcloud.payment.order.controller;

import com.zzz.cloud.common.common.CommonResult;
import com.zzz.cloud.common.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: OrderController
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/6/2414:55
 */
@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_SERVER = "http://CLOUD-PROVIDER-PYMENT";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/pyment/list")
    public CommonResult<List<Payment>> list(){
        return restTemplate.getForObject(PAYMENT_SERVER+"/payment/list", CommonResult.class);
    }

    @GetMapping("/consumer/pyment/discover")
    public CommonResult<Object> discover(){
        return restTemplate.getForObject(PAYMENT_SERVER+"/payment/discovery", CommonResult.class);
    }
}
