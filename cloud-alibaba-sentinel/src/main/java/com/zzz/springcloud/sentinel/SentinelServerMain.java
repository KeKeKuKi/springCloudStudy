package com.zzz.springcloud.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: PaymentProviderNacosMain
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1319:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServerMain {
    public static void main(String[] args) {
        SpringApplication.run(SentinelServerMain.class, args);
    }
}
