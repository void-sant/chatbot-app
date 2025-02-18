package com.sk.chatbot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sk.chatbot.entity.ChatHistory;

public interface ChatHistoryRepository extends MongoRepository<ChatHistory, String>{

}
