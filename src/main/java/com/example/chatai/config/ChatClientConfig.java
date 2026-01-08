package com.example.chatai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName ChatClient
 * Description:
 * Author: zgh
 * CreateDate: 2026/1/8 16:50
 * Version: 1.0
 */
@Configuration
public class ChatClientConfig {
    @Bean
    public ChatClient chatClient(OllamaChatModel ollamaChatModel){
      return ChatClient.builder(ollamaChatModel)
              .build();
    }
}
