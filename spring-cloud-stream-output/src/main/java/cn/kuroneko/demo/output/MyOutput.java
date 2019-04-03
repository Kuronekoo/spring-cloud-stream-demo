package cn.kuroneko.demo.output;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MyOutput {
    String OUTPUT = "MY_OUT_PUT";

    @Output("MY_OUT_PUT")
    MessageChannel output();
}
