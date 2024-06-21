package com.example.demo.Service;

import com.example.demo.Model.MessageEntity;
import com.example.demo.Repository.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@EnableKafka
@Service
public class KafkaConsumerService {
    private static final Logger log = LoggerFactory.getLogger(KafkaConsumerService.class);

    @Autowired
    private MessageRepository messageRepository;

    @KafkaListener(topics = "my_topic", groupId = "my_group")
    public void listen(String message) {
        log.info("Consumed message : {}", message);
        if (message.isBlank()) {
            throw new RuntimeException("Failed");
        }

        //saving the consumed message to mongoDB
        MessageEntity entity = new MessageEntity();
        entity.setMessage(message);
        messageRepository.save(entity);

        log.info("Message saved to MongoDB: {}", message);

    }

}
