package ua.edu.ucu.apps.FlowerStoreWeb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlowerStoreAppConfig {
    @Bean
    public String getData() {
        return "FlowerStore API";
    }
}
