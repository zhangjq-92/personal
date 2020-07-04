package com.example.dubboconsumer.mq;

import com.example.dubboconsumer.entity.Student;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Service
@RocketMQMessageListener(topic = "test-topic-2", consumerGroup = "my-consumer_test-topic-2")
public class MqConsumer implements RocketMQListener<Student> {

    @Override
    public void onMessage(Student student) {
        System.out.println("receive message :" + student.toString());
    }
}
