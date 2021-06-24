package com.zzz.cloud.eureka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: EurekaServer
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/6/2416:36
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer01 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer01.class, args);
    }
}
