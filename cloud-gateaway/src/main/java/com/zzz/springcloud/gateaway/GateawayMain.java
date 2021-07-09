package com.zzz.springcloud.gateaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: GateawayMain
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/918:22
 */
@SpringBootApplication
@EnableEurekaClient
public class GateawayMain {
    public static void main(String[] args) {
        SpringApplication.run(GateawayMain.class, args);
    }
}
