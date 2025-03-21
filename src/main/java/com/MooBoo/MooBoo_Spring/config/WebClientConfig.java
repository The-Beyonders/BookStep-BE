package com.MooBoo.MooBoo_Spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Configuration
public class WebClientConfig {

    @Value("${book.api.baseurl}")
    private String baseUrl;

    @Value("${book.api.key}")
    private String apikey;

    /**
     * 알라딘 독서 API 접근을 위한 WebClient 등록
     */
    @Bean
    public WebClient bookApiClient() {
        return WebClient.builder()
                .baseUrl(baseUrl)
                .defaultUriVariables(Map.of("ttbkey", apikey))
                .build();
    }
}
