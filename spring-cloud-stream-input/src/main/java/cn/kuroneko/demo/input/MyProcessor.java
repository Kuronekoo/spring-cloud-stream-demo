package cn.kuroneko.demo.input;

import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

public interface MyProcessor extends MyInput, TransOutput {
}
