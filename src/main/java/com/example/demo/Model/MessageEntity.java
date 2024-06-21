package com.example.demo.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "messages")
@Data
public class MessageEntity {
    @Id
    private String id;
    private String message;

}
