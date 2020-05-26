package com.study.mq.rabbitmq.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConnectionUtil {

    public static Connection getConnection() throws Exception{

        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        factory.setPort(5672);
        //factory.setVirtualHost("/test");
        factory.setUsername("guest");
        factory.setPassword("guest");
        //通过工程获取连接
        Connection connection = factory.newConnection();
        return connection;
    }

}
