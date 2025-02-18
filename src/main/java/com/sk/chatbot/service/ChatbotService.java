package com.sk.chatbot.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.chatbot.entity.ChatHistory;
import com.sk.chatbot.repository.ChatHistoryRepository;

@Service
public class ChatbotService {

	@Autowired
    private OpenAIService openAIService;

    @Autowired
    private ChatHistoryRepository chatHistoryRepository;

    public String processMessage(String userMessage) {
        String botResponse = openAIService.getChatResponse(userMessage);

        // Save chat history
        ChatHistory chatHistory = new ChatHistory();
        chatHistory.setUserMessage(userMessage);
        chatHistory.setBotResponse(botResponse);
        chatHistory.setTimestamp(LocalDateTime.now());
        chatHistoryRepository.save(chatHistory);

        return botResponse;
    }
}
