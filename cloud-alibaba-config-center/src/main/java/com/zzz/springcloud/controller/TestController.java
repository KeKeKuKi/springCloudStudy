package com.zzz.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: TestController
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1418:17
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class TestController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/getConfig")
    public String getConfig(){
        return configInfo;
    }

}
