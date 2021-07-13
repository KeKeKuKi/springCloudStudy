package com.zzz.springcloud.stream.service.impl;

import com.zzz.springcloud.stream.service.ImassageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author ZhaoZezhong
 * @version V1.0
 * @Title: MessageProviderImpl
 * @Description: Company:成都平凡谷科技有限责任公司
 * @date 2021/7/1310:01
 */
@EnableBinding({Source.class})
public class MessageProviderImpl implements ImassageProvider {

    @Resource
    private MessageChannel output;


    @Override
    public String send() {
        String uid = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uid).build());
        System.out.println("uuid: " + uid);
        return uid;
    }
}
