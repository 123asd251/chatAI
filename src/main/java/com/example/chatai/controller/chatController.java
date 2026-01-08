package com.example.chatai.controller;

import lombok.AllArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

/**
 * ClassName chatController
 * Description:
 * Author: zgh
 * CreateDate: 2026/1/8 16:41
 * Version: 1.0
 */
@AllArgsConstructor
@RestController
@RequestMapping("/chatAI")
public class chatController {
    private final ChatClient ChatClientConfig;
    @GetMapping(value="/chat", produces = "text/event-stream;charset=UTF-8")
    public Flux<String> chat(@RequestParam String prompt){
        return ChatClientConfig.prompt()
                .user(prompt)
                .stream()
                .content();
    }
}
