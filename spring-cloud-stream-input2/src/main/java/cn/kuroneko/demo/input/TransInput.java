package cn.kuroneko.demo.input;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface TransInput {
    String TRANS_INPUT="TRANS_INPUT";

    @Input("TRANS_INPUT")
    SubscribableChannel receive();
}
