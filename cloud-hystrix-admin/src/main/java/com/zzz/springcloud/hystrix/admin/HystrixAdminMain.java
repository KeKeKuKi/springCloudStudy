package com.zzz.springcloud.hystrix.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: HystrixAdminMain
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/914:41
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixAdminMain {
    public static void main(String[] args) {
        SpringApplication.run(HystrixAdminMain.class, args);
    }
}
