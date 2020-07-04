package com.example.dubboprovider.controller;

import com.example.dubboprovider.mq.MqProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource(name = "mqProducer")
    private MqProducer mqProducer;

    @GetMapping("/sendmsg")
    public String sendStudentMq(){
        mqProducer.sendMessage();
        return "发送消息成功";
    }
}
