package com.example.activemqdemo;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String queueName, Object message) {
        jmsTemplate.convertAndSend(queueName, message);
    }
}
