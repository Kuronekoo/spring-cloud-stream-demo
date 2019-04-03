package cn.kuroneko.demo.output;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyInput {
    String INPUT="MY_IN_PUT";

    @Input("MY_IN_PUT")
    SubscribableChannel receive();
}
