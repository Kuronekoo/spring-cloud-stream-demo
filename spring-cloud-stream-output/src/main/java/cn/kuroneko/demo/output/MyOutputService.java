package cn.kuroneko.demo.output;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(MyOutput.class)
public class MyOutputService {
    @Autowired
    private MyOutput myOutput;

    public void sendMsg(String msg){
        System.out.println("my out send " +msg);
        myOutput.output().send(MessageBuilder.withPayload(msg).build());
    }
}
