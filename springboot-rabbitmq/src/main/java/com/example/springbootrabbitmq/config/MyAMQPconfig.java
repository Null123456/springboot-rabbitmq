package com.example.springbootrabbitmq.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAMQPconfig {
    @Bean
    public MessageConverter messageConverter(){
        //消息序列化成json格式
        return new Jackson2JsonMessageConverter();
    }
}
