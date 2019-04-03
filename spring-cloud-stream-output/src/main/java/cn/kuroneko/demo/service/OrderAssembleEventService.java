package cn.kuroneko.demo.service;

import cn.kuroneko.demo.constrans.StreamConstrans;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface OrderAssembleEventService {
    /**
     * 集单 完成 通知 拣货
     *
     * @return
     */
    @Output(StreamConstrans.ORDER_ASSEMBLE_DOMAIN_OUTPUT)
    MessageChannel outPutMessageChannel();

    /**
     * 订阅
     * @return
     */
    @Input(StreamConstrans.ORDER_ASSEMBLE_DOMAIN_INPUT)
    SubscribableChannel subscribe();
}