package cn.kuroneko.demo.input;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TransOutput {
    String TRANS_OUTPUT="TRANS_OUT";

    @Output("TRANS_OUT")
    MessageChannel transoutput();
}
