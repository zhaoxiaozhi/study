//package com.study.redis.config;
//
//import com.study.redis.RedisMQ;
//import com.study.redis.domain.Route;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class MqConfig {
//
//    @Bean(name = "redisMQ")
//    @Primary
//    public RedisMQ getRedisMq() {
//        RedisMQ redisMQ = new RedisMQ();
//        // 配置监听队列元素数量
//        redisMQ.setMonitorCount(monitorCount);
//        // 配置路由表
//        redisMQ.setRoutes(routeList());
//        return redisMQ;
//    }
//
//    /**
//     * 返回路由表
//     * @return
//     */
//    public List<Route> routeList() {
//        List<Route> routeList = new ArrayList<>();
//        Route routeFirst = new Route(queueFirst, listFirst);
//        Route routeSecond = new Route(queueSecond, listSecond);
//        routeList.add(routeFirst);
//        routeList.add(routeSecond);
//        return routeList;
//    }
//
//    @Value("${mq.monitor.count}")
//    private int monitorCount;
//    @Value("${mq.queue.first}")
//    private String queueFirst;
//    @Value("${mq.queue.second}")
//    private String queueSecond;
//    @Value("${mq.consumer.first}")
//    private String listFirst;
//    @Value("${mq.consumer.second}")
//    private String listSecond;
//}
//
