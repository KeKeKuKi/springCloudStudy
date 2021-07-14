package com.zzz.springcloud.order;

import com.zzz.springcloud.order.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.Ordered;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: OrderConsumerNacosMain
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1417:17
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = OrderService.class)
public class OrderConsumerNacosMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerNacosMain.class, args);
    }
}
