# springboot-rabbitmq
springboot整合rabbitmq



消息中间件系列 



        JMS：java消息服务，基于jvm消息代理的规范。    	 ActiveMQ、HornetMQ
				
				
        AMQP：高级消息队列协议。也是一个消息代理的规范，兼容JMS。   RabbitMQ
				
        
 RabbitMQ：由Erlang开发的AMQP的开源实现。
 
 
 
          Message：消息。由消息头和消息体组成。消息体是不透明的。
					
					
          Publisher：消息的生产者。也是一个向交换器发布消息的客户端应用程序。
					
					
          Exchange：交换器。用来接收生产者发送消并将这些消息路由给服务器中的队列。
					
                    类型：direct（默认）、fanout、topic、headers，不同类型转发消息策略有所不同。
										
										
          Queue：消息队列，消息容器。
					
					
          Binding：用于消息队列和交换器之间的关联。一个绑定就是基于路由键将交换器和消息队列连接起来的路由规则。
					
					
          Conection：网络连接。比如tcp连接
					
					
          Channel：信道。多路复用连接中的一条独立的双向数据流通道。
					
					
          Consumer:消费者。
					
					
          Virtual Host：虚拟主机
					
					
          Broker：消息服务器
