package cn.kuroneko.demo.input;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.ServiceActivator;

@EnableBinding(MyProcessor.class)
public class MyProcessService {

    @ServiceActivator(inputChannel = MyProcessor.INPUT,outputChannel = MyProcessor.TRANS_OUTPUT)
    public String  process(String msg){
        System.out.println("process received "+msg);
        return msg;
    }
}
