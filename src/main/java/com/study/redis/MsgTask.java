//package com.study.redis;
//
//import com.alibaba.fastjson.JSONObject;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * 发送消息
// */
//@Component
//public class MsgTask {
//
//    @Resource
//    private RedisMQ redisMQ;
//    // @Value("${mq.list.first}") private String MQ_LIST_FIRST;
//
//    @Scheduled(cron="*/5 * * * * *")
//    public void sendMsg() {
//        // 消费
//        List<String> msgs = redisMQ.consume(redisMQ.getRoutes().get(0).getList());
//        int len;
//        if (null != msgs && 0 < (len = msgs.size())) {
//            // 将每一条消息转为JSONObject
//            JSONObject jObj;
//            for (int i = 0; i < len; i++) {
//                if (!StringUtils.isEmpty(msgs.get(i))) {
//                    jObj = JSONObject.parseObject(msgs.get(i));
//                    // 取出消息
//                    System.out.println(jObj.toJSONString());
//                }
//            }
//        }
//    }
//}
