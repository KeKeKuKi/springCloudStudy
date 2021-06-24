package com.zzz.springcloud.payment.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: ApplicationContextConfig
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/6/2414:59
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
