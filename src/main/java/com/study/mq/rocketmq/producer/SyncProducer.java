package com.study.mq.rocketmq.producer;

import org.apache.rocketmq.client.producer.DefaultMQProducer;

public class SyncProducer {

    public static void main(String[] args) throws Exception{
        //实例化消息生产者Producer
        DefaultMQProducer producer = new DefaultMQProducer("please_rename_unique_group_name");

    }
}
