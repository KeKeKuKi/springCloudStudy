package com.zzz.springcloud.order;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: com.zzz.springcloud.com.zzz.springcloud.order.OrderServer
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/6/2414:39
 */
@EnableFeignClients
@SpringBootApplication
@EnableHystrix
public class OrderServer {
    public static void main(String[] args) {
        SpringApplication.run(OrderServer.class, args);
    }
}
