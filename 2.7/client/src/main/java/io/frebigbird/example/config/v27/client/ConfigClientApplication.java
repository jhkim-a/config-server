package io.frebigbird.example.config.v27.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(
        @Value("${greeting.message}") String greetingMessage
    ) {
        return args -> {
            System.out.println(">>>> " + greetingMessage);
        };
    }
}
