package com.example.springbootrabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自动配置
 * 1.RabbitAutoConfiguration
 * 2.有自动配置了连接工厂ConnectionFactory
 * 3.rabbitProperties封装了RabbitMQ的配置
 * 4.RabbitTemplate,给rabbitmq发送和接受消息
 * 5.AmqpAdmin:rabbitmqq系统管理功能组件：和 web界面类似 http://localhost:15672/
 *      创建和删除Queue，Exchange,Bingding
 * 6.@EnableRabbit + @RabbitListener 监听消息队列的内容
 */

@EnableRabbit //开启基于注解的rabbitmq
@SpringBootApplication
public class SpringbootRabbitmqApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootRabbitmqApplication.class, args);
    }

}
