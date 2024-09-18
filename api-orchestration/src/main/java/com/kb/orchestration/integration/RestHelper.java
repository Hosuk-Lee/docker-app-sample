package com.kb.orchestration.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@AllArgsConstructor
@Component
public class RestHelper {

    private final Environment env;

    private final RestTemplate restTemplate;

    public <T,Z> T postCall(String target
            , String path
            , MultiValueMap<String, String> queryParams
            , Map<String, Object> pathParam
            , Z body
            , Class<T> responseType){

        final String url = env.getProperty(String.format("integration.%s.url", target));
        assert url != null;

        if ( queryParams == null ) {
            queryParams = new LinkedMultiValueMap<>();
        }

        if ( pathParam == null ) {
            pathParam = new HashMap<>();
        }

        queryParams.add("key1", "value1");
        URI uri = UriComponentsBuilder
//                .fromUriString("http://localhost:9090")
                .fromUriString(url)
                .path(path)
                .queryParams(queryParams) // MultiValueMap을 쿼리 파라미터로 추가
                .buildAndExpand(pathParam)
                .toUri();


        // HTTP 헤더 설정
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        // headers.add("Content-Type", "application/json");
        // headers.add("Authorization", "Bearer <access_token>"); // TODO 토큰
        // 요청 매개변수 설정



        HttpEntity<Z> requestEntity = new HttpEntity<>(body, headers);

        ResponseEntity<T> responseEntity = null;
//        try{
            responseEntity = restTemplate.exchange(
                    uri,
                    HttpMethod.POST,
                    requestEntity,
                    responseType
            );
//        } catch (RestClientException e) {
//            ExceptionUtils.printRootCauseStackTrace(e);
//            log.error("error {}", e.getMessage());
//            // error log
//        }
        return responseType.cast( responseEntity.getBody());
    }

    public class sss{
        String s;
    }

    public static void main(String[] args) {
        // Base URL 설정
        String baseUrl = "https://example.com/api/resource";

        // MultiValueMap 생성 및 값 추가
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("key1", "value1");
        queryParams.add("key1", "value2");
        queryParams.add("key2", "value3");

        // UriComponentsBuilder를 사용하여 URI 생성
        String uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParams(queryParams) // MultiValueMap을 쿼리 파라미터로 추가
                .build()
                .toUriString();

        // 출력 결과
        System.out.println(uri);
    }

}
