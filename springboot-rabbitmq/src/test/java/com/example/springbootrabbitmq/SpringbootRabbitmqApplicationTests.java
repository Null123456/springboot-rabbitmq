package com.example.springbootrabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class SpringbootRabbitmqApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    //创建交换器
    public void createExchange(){
        amqpAdmin.declareExchange(new DirectExchange("amqpadmin"));
        System.out.println("创建完成");

       // 创建队列 amqpAdmin.declareQueue(new Queue("amqpadmin.queue",true));
        //绑定规则
        //amqpAdmin.declareBinding(new Binding("amqpadmin.queue",Binding.DestinationType.QUEUE,"amqpadmin","amqp.haha",null));
    }


    /**
     * 点对点
     */

    @Test
    void contextLoads() {
        //message自己构造，定义消息体和消息头
        //rabbitTemplate.send(exchage,routKey,message);

        //只需要传入要发送的对象，自动序列化发送给rabbitmq
       // rabbitTemplate.convertAndSend(exchage,routeKey,object);
        Map<String,Object> map = new HashMap<>();
        map.put("name","孙尚坤");
        map.put("age","24");
        map.put("sex","男");
        //对象被默认序列化以后发送出去
        rabbitTemplate.convertAndSend("exchange.direct","atguigu.news",map);

    }

    //接受数据
    @Test
    public void receive(){
        Object o = rabbitTemplate.receiveAndConvert("atguigu.news");
        System.out.println(o);
    }

    /**
     * 广播
     */
    @Test
    public void sendMsg(){
        rabbitTemplate.convertAndSend("exchange.fanout","","3");
    }
}
