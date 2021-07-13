package com.zzz.springcloud.stream.controller;

import com.zzz.springcloud.stream.service.ImassageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: MessageController
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1310:11
 */
@RestController
public class MessageController {
    @Resource
    ImassageProvider imassageProvider;

    @GetMapping("/sendUid")
    public String sendUid(){
        return imassageProvider.send();
    }

}
