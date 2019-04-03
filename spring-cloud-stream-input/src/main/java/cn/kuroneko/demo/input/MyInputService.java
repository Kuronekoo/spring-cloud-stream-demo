package cn.kuroneko.demo.input;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;


//@EnableBinding({MyInput.class})
public class MyInputService {

//    @StreamListener(MyInput.INPUT)
    public void receive(String msg){
        System.out.println("my input ceceived " +msg);
    }
}
