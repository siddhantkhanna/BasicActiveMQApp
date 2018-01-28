package com.example.activemqdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Producer producer;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void home() {
        producer.send("mailbox", new Email("siddhant", "hello"));
    }
}
