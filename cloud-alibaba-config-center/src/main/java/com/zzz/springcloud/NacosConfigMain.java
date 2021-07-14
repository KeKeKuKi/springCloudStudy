package com.zzz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: NacosConfigMain
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1418:15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigMain {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigMain.class, args);
    }
}
