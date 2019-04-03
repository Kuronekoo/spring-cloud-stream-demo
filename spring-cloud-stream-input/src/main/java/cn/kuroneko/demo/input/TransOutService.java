package cn.kuroneko.demo.input;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;

//@EnableBinding(TransOutput.class)
public class TransOutService {

    @Autowired
    private TransOutput transOutput;

//    @StreamListener(TransOutput.TRANS_OUTPUT)
    public void send(String msg){
        System.out.println("trans out put " +msg);
//        transOutput.output().send(MessageBuilder.withPayload(msg).build());
    }
}
