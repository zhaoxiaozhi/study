package com.study.mq.rabbitmq.listener;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MQDemo {

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Test
    public void testSend() throws InterruptedException{
        String msg = "hello, Spring boot amqp";
        this.amqpTemplate.convertAndSend("spring.test.exchange","a.b", msg);
        // 等待10秒后再结束
        Thread.sleep(10000);
    }
}
