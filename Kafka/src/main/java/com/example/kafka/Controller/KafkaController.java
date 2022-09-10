package com.example.kafka.Controller;

import com.example.kafka.Component.Producer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1.0/kafkaController")
public class KafkaController {
    Producer producer;


    public KafkaController(Producer producer){
        this.producer=producer;
    }

    @GetMapping(path = "/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        producer.send(message);

        return ResponseEntity.ok("message sent");
    }
}
