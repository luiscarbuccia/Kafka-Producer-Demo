package com.carbuccia.kafkaproducerdemo.service;

import com.carbuccia.kafkaproducerdemo.record.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageServiceImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(MessageRequest request){
        kafkaTemplate.send("testTopic", request.message());
    }
}
