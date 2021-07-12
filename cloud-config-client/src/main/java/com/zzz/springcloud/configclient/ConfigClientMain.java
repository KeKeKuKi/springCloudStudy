package com.zzz.springcloud.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: ConfigClientMain
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1216:55
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain.class, args);
    }
}
