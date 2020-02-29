package com.example.springbootrabbitmq.Service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookService {
    @RabbitListener(queues = "atguigu.news")
    public void receive(String s){
        System.out.println("收到消息"+s);

    }


    //带请求头
    @RabbitListener(queues = {"atguigu.news","atguigu"} )
    public void receive1(Message message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
