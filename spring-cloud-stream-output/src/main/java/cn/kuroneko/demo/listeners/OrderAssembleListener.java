/*
 * Copyright (c) 2010-2018 www.co-mall.com/ Inc. All rights reserved.
 * 注意：本内容仅限于北京科码先锋互联网技术股份有限公司内部传阅，禁止外泄以及用于其他商业目的。
 */

package cn.kuroneko.demo.listeners;


import cn.kuroneko.demo.constrans.StreamConstrans;
import cn.kuroneko.demo.service.OrderAssembleEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * 集单监听
 *
 * @author wanchuanlai Email:wanchuanlai@co-mall.com
 * @since 8/19/18 17:11
 */
@EnableBinding({OrderAssembleEventService.class, Source.class, Sink.class})
@Component
public class OrderAssembleListener {

    @Autowired
    OrderAssembleEventService orderAssembleEventService;

    /**
     * 监听已接单事件
     *
     * @param
     */
    @StreamListener(value = StreamConstrans.ORDER_ASSEMBLE_DOMAIN_INPUT)
    public void accepted(Message<String> message) {
        System.out.println("监听到 AcceptedOrderEvent" + message.getPayload());
    }

    public void send(){
        orderAssembleEventService.outPutMessageChannel().send(MessageBuilder.withPayload("大家好").build());
    }
}
