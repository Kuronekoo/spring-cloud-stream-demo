package cn.kuroneko.demo.sendtobind;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SendToBinder {
    String SENDBINDER_INPUT="SENDBINDERINPUT";
    String SENDBINDER_OUTPUT="SENDBINDEROUTPUT";

    @Output(SENDBINDER_OUTPUT)
    MessageChannel output();

    @Input(SENDBINDER_INPUT)
    SubscribableChannel input();
}
