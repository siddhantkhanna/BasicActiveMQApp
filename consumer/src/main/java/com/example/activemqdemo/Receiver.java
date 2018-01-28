package com.example.activemqdemo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void processMessage(Email email) {
        System.out.println("Processing Message <" + email + ">");
    }

}