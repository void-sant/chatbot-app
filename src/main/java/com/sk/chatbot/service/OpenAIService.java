package com.sk.chatbot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.theokanning.openai.service.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;

@Service
public class OpenAIService {
	
    @Value("${openai.api.key}")
    private String apiKey;

    public String getChatResponse(String userMessage) {
        OpenAiService service = new OpenAiService(apiKey);
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(userMessage)
                .model("gpt-3.5-turbo-instruct")//("gpt-4")//("text-davinci-003")
                .maxTokens(100)
                .build();

        return service.createCompletion(completionRequest).getChoices().get(0).getText();
    }

}
