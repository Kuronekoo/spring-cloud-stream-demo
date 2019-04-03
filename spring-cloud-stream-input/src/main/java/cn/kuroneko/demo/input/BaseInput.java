package cn.kuroneko.demo.input;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

//@EnableBinding(Sink.class)
public class BaseInput {

//    @StreamListener(Sink.INPUT)
    public void receive(String playload){
        System.out.println("base input received :"+playload.toString());
    }
}
