package com.zzz.springcloud.configcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: ConfigCenterMain
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1216:12
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain.class, args);
    }
}
