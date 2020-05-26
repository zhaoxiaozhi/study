package com.study.mq.rabbitmq.consumer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.MessageProperties;
import com.study.mq.rabbitmq.util.ConnectionUtil;

public class Send {

    private final static String QUEUE_NAME  = "simple_queue";

    public static void main(String[] args) throws Exception{
        //获取到连接以及mq通道
        Connection connection = ConnectionUtil.getConnection();
        //从连接中常见通道，这是完成大部分API的地方
        Channel channel = connection.createChannel();
        // 声明（创建）队列，必须声明队列才能够发送消息，我们可以把消息发送到队列中。
        // 声明一个队列是幂等的 - 只有当它不存在时才会被创建
        channel.queueDeclare(QUEUE_NAME,true, false, false, null);
        String message = "Hello World";
        for (int i = 0; i < 50; i++){
            channel.basicPublish("",QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN, (message + " " + i).getBytes());
            System.out.println("[X] Sent '" + message + "'");
        }

        channel.close();
        connection.close();
    }
}
