package com.example.demo.Controller;

import com.example.demo.Service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class KafkaController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/publish")
    public ResponseEntity<String> sendMessageToKafka(@RequestParam("message") String message){
        try {
            kafkaProducerService.sendMessage("my_topic", message);
            return new ResponseEntity<>("Message sent to Kafka topic!", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to send message to Kafka topic!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
