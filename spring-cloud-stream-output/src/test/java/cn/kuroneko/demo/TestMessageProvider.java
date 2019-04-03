package cn.kuroneko.demo;

import javax.annotation.Resource;

import cn.kuroneko.demo.listeners.OrderAssembleListener;
import cn.kuroneko.demo.output.BaseOutput;
import cn.kuroneko.demo.output.MyOutputService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMessageProvider {
    @Resource
    private OrderAssembleListener orderAssembleListener;

    @Resource
    private BaseOutput baseOutput;

    @Resource
    private MyOutputService myOutputService;

    @Test
    public void testSend() {
        orderAssembleListener.send();
    }
    @Test
    public void testSendVase() {
        baseOutput.sendMsg("Test");
    }

    @Test
    public void testSendMy() {
        myOutputService.sendMsg("yoyoyo");
    }
}