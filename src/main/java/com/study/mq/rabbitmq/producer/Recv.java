package com.study.mq.rabbitmq.producer;

import com.rabbitmq.client.*;
import com.study.mq.rabbitmq.util.ConnectionUtil;

import java.io.IOException;

public class Recv {

    private final static String QUEUE_NAME = "simple_queue";

    public static void main(String[] args) throws Exception{

        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        channel.basicQos(1);
        //定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel){

            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
               String msg = new String(body);
                System.out.println(" [x] received : " + msg + "!");
            }
        };
        //监听队列
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}
