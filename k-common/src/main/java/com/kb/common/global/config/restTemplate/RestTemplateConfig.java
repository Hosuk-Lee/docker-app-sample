package com.kb.common.global.config.restTemplate;

import java.util.Collections;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Configuration
public class RestTemplateConfig {

    private final CustomResponseErrorHandler customResponseErrorHandler;

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(5000); // 기본 -1
        requestFactory.setReadTimeout(5000); // 기본 -1
        restTemplate.setRequestFactory(requestFactory);
        // REST LOG DEBUG
        restTemplate.setInterceptors(Collections.singletonList(new LoggingRequestInterceptor()));
        restTemplate.setErrorHandler(customResponseErrorHandler);
        return restTemplate;
    }

//    @Bean
//    public RestTemplate restTemplateWithPool() {
//        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
//        factory.setConnectTimeout(5000);
//        factory.setConnectionRequestTimeout(5000);
//
//        HttpClient httpClient = HttpClient.newBuilder().max.build();
//
//                HttpClientBuilder.create()
//                .setMaxConnTotal(100) // maxConnTotal: 연결을 유지할 최대 숫자
//                .setMaxConnPerRoute(5) // maxConnPerRoute: 특정 경로당 최대 숫자
//                .setConnectionTimeToLive(5, TimeUnit.SECONDS) // keep - alive
//                .build();
//        factory.setHttpClient(httpClient);
//
//        return new RestTemplate(factory);
//    }
}
