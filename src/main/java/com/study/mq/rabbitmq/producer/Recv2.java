package com.study.mq.rabbitmq.producer;

import com.rabbitmq.client.*;
import com.study.mq.rabbitmq.util.ConnectionUtil;

import java.io.IOException;

public class Recv2 {

    private final static String QUEUE_NAME = "simple_queue";

    public static void main(String[] args) throws Exception{

        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        //定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel){
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String msg = new String(body);
                System.out.println(" [x] received : " + msg + "!");
                channel.basicAck(envelope.getDeliveryTag(), false);
            }
        };
        //监听队列
        channel.basicConsume(QUEUE_NAME, false, consumer);
    }
}
