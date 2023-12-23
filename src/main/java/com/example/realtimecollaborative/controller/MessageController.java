
package com.example.realtimecollaborative.controller;

import com.example.realtimecollaborative.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private  SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/message")
    public Message getContent(Message message) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       messagingTemplate.convertAndSend("/topic/return-to", message);
        return message;
    }
}
