package com.example.dubboprovider.mq;

import com.example.dubboprovider.student.entity.Student;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("mqProducer")
public class MqProducer {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    public void sendMessage(){
        String name = "aaa";
        rocketMQTemplate.convertAndSend("test-topic-1", name);
        Student student = new Student();
        student.setAge(12);
        student.setId(2L);
        student.setName("haha");
        rocketMQTemplate.send("test-topic-2", MessageBuilder.withPayload(student).build());

        System.err.println("发送成功...");
    }
}
