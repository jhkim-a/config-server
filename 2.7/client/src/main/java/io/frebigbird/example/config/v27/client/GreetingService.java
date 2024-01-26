package io.frebigbird.example.config.v27.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("greeting")
public class GreetingService {
    @Value("${greeting.message}")
    private String greetingMessage;

    @GetMapping
    public String message() {
        return greetingMessage;
    }
}
