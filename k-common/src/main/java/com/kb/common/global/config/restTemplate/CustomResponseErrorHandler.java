package com.kb.common.global.config.restTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kb.common.global.exception.BusinessException;
import com.kb.common.global.exception.CErrorCode;
import com.kb.common.global.exception.CTreatCode;
import com.kb.common.global.exception.ErrorResponseDto;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.ResponseErrorHandler;

@RequiredArgsConstructor
@Slf4j
@Component
public class CustomResponseErrorHandler implements ResponseErrorHandler {

    private final ObjectMapper objectMapper;

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
// hasError(response)
// 이 메서드에서 True를 반환하면, handleError 메서드로 response가 넘어간다.
//
// 구현 조건은 DefaultResponseErrorHandler와 거의 동일합니다.
// response의 Status code가 4xx or 5xx 라면 True를 반환합니다.
// 그 외의 상황이라면 False를 반환합니다.

        log.info("DEBUG::::{}", response.getStatusText());
        return response.getStatusCode().is4xxClientError() ||
                response.getStatusCode().is5xxServerError();
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
// response를 읽고, 처리 로직이 들어가는 메서드
// getResponseBody 메서드를 통해 response의 body에 담겨 있는 메시지를 String 타입(JSON)으로 가져옴.
// String 형식의 JSON을 ObjectMapper를 활용해 객체 타입으로 변환합니다.

        // 저는 InternalServerErrorVO 를 만들었습니다.
        // response.g
//        byte[] responseBody = getResponseBody(response);
//        String responseBody = new String(getResponseBody(response), "utf-8");
//        log.info("응답 데이터 : {}", responseBody);
//        ErrorResponseDto errorResponse = objectMapper.readValue(responseBody, ErrorResponseDto.class);
//        if (HttpStatus.INTERNAL_SERVER_ERROR == HttpStatus.valueOf(errorResponse.getStatusCode()) &&
//                errorResponse.getStatus().equals("Business Error")) {
//            throw new BusinessException(CErrorCode.builder()
//                    .code(errorResponse.getErrorCode())
//                    .message(errorResponse.getErrorMessage())
//                    .build(),
//                    CTreatCode.builder()
//                            .code(errorResponse.getTreatCode())
//                            .message(errorResponse.getTreatMessage())
//                            .build(),
//                    "custom error"
//                    );
//        }

        DefaultResponseErrorHandler defaultResponseErrorHandler = new DefaultResponseErrorHandler();
        defaultResponseErrorHandler.handleError(response);
    }

    private byte[] getResponseBody(ClientHttpResponse response) {
        try {
//            return FileCopyUtils.copyToByteArray(response.getBody());
            return StreamUtils.copyToByteArray(response.getBody());
        } catch (IOException ignored) {
        }
        return new byte[0];
    }

}
