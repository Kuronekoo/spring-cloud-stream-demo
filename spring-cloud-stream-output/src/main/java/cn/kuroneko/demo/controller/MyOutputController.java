package cn.kuroneko.demo.controller;

import cn.kuroneko.demo.output.MyOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/output")
public class MyOutputController {
    @Autowired
    MyOutputService myOutputService;


    @GetMapping("/send/{msg}")
    public String output(@PathVariable("msg")String msg){
        myOutputService.sendMsg(msg);
        return "succ";
    }


}
