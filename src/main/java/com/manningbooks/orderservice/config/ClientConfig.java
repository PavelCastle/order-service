package com.manningbooks.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration

public class ClientConfig {

    @Bean
    @SuppressWarnings("Spring- JavaInjectionPointsAutowiringInspection")
    WebClient webClient(
            ClientProperties clientProperties,
            WebClient.Builder webClientbuilder
    ) {
        return webClientbuilder.baseUrl(clientProperties.catalogServiceUri().toString())
                .build();
    }

}
