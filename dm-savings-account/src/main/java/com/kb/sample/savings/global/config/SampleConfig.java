package com.kb.sample.savings.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@Configuration
public class SampleConfig {

    @Bean
    public RestTemplate restTemplate() {
//        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
//        HttpClient httpClient =
//        HttpClientBuilder.
        return new RestTemplate();
    }
}
