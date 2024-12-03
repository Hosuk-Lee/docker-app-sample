package com.kb.common.global.advice;

import com.kb.common.global.exception.BusinessException;
import com.kb.common.global.exception.ErrorResponseDto;
import com.kb.common.global.exception.GErrorCode;
import com.kb.common.global.exception.GTreatCode;
import com.kb.common.global.exception.IErrorCode;
import com.kb.common.global.exception.ITreatCode;
import jakarta.servlet.ServletRequest;
import java.time.LocalDateTime;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    public static final String TRACE = "trace";
    @Value("${error.printStackTrace:true}")
    private boolean printStackTrace;

    public GlobalExceptionHandler() {

    }

    @ExceptionHandler({BusinessException.class})
//    public ResponseEntity<Object> handle(Exception ex, Object body
//            , HttpHeaders headers
//            , HttpStatusCode statusCode
//            , WebRequest request) {
    public ResponseEntity<Object> handleBusinessException(BusinessException ex
        , ServletRequest request) {
        log.error("ERROR - BusinessException", ex);
        return buildErrorResponse(ex, ex.getMessage(),
            ex.getErrorCode(),
            ex.getTreatCode(),
            HttpStatus.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()), request);
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> handleException(Exception ex
        , ServletRequest request) {
        log.info("ERROR - Exception", ex);
        return buildErrorResponse(ex, ex.getMessage(),
            GErrorCode.SYSTEM_ERROR,
            GTreatCode.SYSTEM_ERROR,
            HttpStatus.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()), request);
    }

    private ResponseEntity<Object> buildErrorResponse(Exception exception,
        String message,
        IErrorCode errorCode,
        ITreatCode treatCode,
        HttpStatus httpStatus,
//            WebRequest request) {
        ServletRequest request) {
        ErrorResponseDto errorResponseDto =
            new ErrorResponseDto(httpStatus.value(), message, LocalDateTime.now(), errorCode,
                treatCode);
        if (printStackTrace && isTraceOn(request)) {
            errorResponseDto.setStackTrace(ExceptionUtils.getStackTrace(exception));
        }
        return ResponseEntity.status(httpStatus).body(errorResponseDto);
    }

    // http://localhost:8080/test?id=0&trace=true
    private boolean isTraceOn(ServletRequest request) {
        String[] value = request.getParameterValues(TRACE);
        return Objects.nonNull(value)
            && value.length > 0
            && value[0].contentEquals("true");
    }

}
