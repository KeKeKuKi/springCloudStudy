package com.zzz.springcloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: StreamProviderMain
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/139:57
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamProviderMain {
    public static void main(String[] args) {
        SpringApplication.run(StreamProviderMain.class, args);
    }
}
