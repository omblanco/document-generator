package com.omblanco.document.generator.engine.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${config.document.store.endpoint}")
    private String storeEndpoint;
    
    @Value("${config.document.exporter.endpoint}")
    private String exporterEndpoint;
    
    @Bean
    @LoadBalanced
    public WebClient.Builder storeWebClient() {
        return WebClient.builder().baseUrl(storeEndpoint);
    }
    
    @Bean
    @LoadBalanced
    public WebClient.Builder exporterWebClient() {
        return WebClient.builder().baseUrl(exporterEndpoint);
    }
}
