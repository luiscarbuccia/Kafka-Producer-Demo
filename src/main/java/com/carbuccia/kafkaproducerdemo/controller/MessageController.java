package com.carbuccia.kafkaproducerdemo.controller;

import com.carbuccia.kafkaproducerdemo.record.MessageRequest;
import com.carbuccia.kafkaproducerdemo.service.MessageServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {
    MessageServiceImpl messageService;

    public MessageController(MessageServiceImpl messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public void publishMessage(@RequestBody MessageRequest messageRequest){
        messageService.sendMessage(messageRequest);
    }
}
