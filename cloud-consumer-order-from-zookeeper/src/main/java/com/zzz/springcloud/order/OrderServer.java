package com.zzz.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: com.zzz.springcloud.order.OrderServer
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/6/2414:39
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderServer {
    public static void main(String[] args) {
        SpringApplication.run(OrderServer.class, args);
    }
}
