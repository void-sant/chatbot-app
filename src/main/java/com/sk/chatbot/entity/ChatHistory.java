package com.sk.chatbot.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Document(collection = "chat_history")
public class ChatHistory {
	
	@Id
    private String id;
    private String userMessage;
    private String botResponse;
    private LocalDateTime timestamp;


}
