package com.example.kafka.Component;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;
@Service
public class Consumer {
    private static final Logger logger= (Logger) LoggerFactory.getLogger(Consumer.class);

    public Consumer(){

    }


    @KafkaListener(topics = "Topic 1", groupId="myGroup")
    public void consume(String message){
        logger.info(String.format("Message received", message));
    }
}
