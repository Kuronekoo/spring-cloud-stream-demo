package cn.kuroneko.demo.output;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

//@EnableBinding(Source.class)
public class BaseOutput {

    @Autowired
    private Source source;

    public void sendMsg(String msg){
        System.out.println("base out send msg:"+msg);
//        source.output().send(MessageBuilder.withPayload(msg).build());
    }
}
