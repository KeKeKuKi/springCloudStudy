package com.zzz.springcloud.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: PaymentServer
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/6/2411:04
 */
@MapperScan("com.zzz.springcloud.**.mapper")
@SpringBootApplication
@EnableEurekaClient
//开启豪猪哥服务功能
@EnableCircuitBreaker
public class PaymentServer {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServer.class, args);
    }
}
