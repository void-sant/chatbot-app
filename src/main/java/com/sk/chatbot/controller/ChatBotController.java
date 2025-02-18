package com.sk.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.chatbot.service.ChatbotService;

@RestController
@RequestMapping("/chatbot")
public class ChatBotController {
	
	    @Autowired
	    private ChatbotService chatbotService;

	    @PostMapping("/send")
	    public ResponseEntity<String> sendMessage(@RequestBody String userMessage) {
	        String botResponse = chatbotService.processMessage(userMessage);
	        return ResponseEntity.ok(botResponse);
	    }

}
