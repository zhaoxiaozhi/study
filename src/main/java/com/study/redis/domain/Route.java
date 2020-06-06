package com.study.redis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 消息路由器，主要控制将消息从指定的队列路由到待消费的list
 * 通过这种方式实现自定义延迟以及优先级发送
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route implements Serializable {

    private static final long serialVersionUID = 8655851615465368473L;

    /**
     * 存放消息的队列
     */
    private String queue;

    /**
     * 待消费的列表
     */
    private String list;

}
