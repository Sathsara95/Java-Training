package com.example.kafka.Component;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class Producer {
    private static final Logger logger= (Logger) LoggerFactory.getLogger(Producer.class);
    private KafkaTemplate<String, String> kafkaTemplate;

    public Producer(){

    }

    public Producer(KafkaTemplate<String,String> temp){

        this.kafkaTemplate=temp;
    }

    public void send(String message){
        logger.info(String.format("message sent", message));
        kafkaTemplate.send("Topic 1",message);
    }
}
