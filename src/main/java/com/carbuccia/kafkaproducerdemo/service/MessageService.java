package com.carbuccia.kafkaproducerdemo.service;

import org.apache.kafka.common.protocol.Message;
import org.springframework.kafka.core.KafkaTemplate;

public interface MessageService {
    public void sendMessage(Message message,  KafkaTemplate<String, String> kafkaTemplate);
}
