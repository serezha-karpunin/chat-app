package com.serezha.broker.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class ChatMessageController {
    @MessageMapping("/chat")
    public String processMessage(String message) {
        DateFormat dateFormat = DateFormat.getTimeInstance();
        return String.format("[%s, %s]: %s", "Anonymous", dateFormat.format(new Date()), message);
    }
}
