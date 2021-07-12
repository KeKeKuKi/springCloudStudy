package com.zzz.springcloud.configclient.controller;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: ConfigController
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1217:01
 */
@RestController
// 添加刷新注解，实现动态刷新
// 在git 修改配置后需要发起一次请求刷新3355配置  curl -X POST "http://localhost:3355/actuator/refresh"
// 当命令返回 类似 ["config.client.version","config.info"] 时则刷新成功，
@RefreshScope
public class ConfigController {
    @Value("${config.info}")
    String configInfo;

    @GetMapping("/getConfig")
    public String getConfigInfo(){
        return configInfo;
    }
}
