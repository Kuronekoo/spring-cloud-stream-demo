package cn.kuroneko.demo.input;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(TransInput.class)
public class TransInService {

    @StreamListener(TransInput.TRANS_INPUT)
    public void receive(String msg){
        System.out.println("trans input ceceived " +msg);
    }
}
