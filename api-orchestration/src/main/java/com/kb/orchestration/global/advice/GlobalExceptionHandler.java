package com.kb.orchestration.global.advice;

import com.kb.orchestration.global.exception.BusinessExcpeion;
import lombok.Getter;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler({BusinessExcpeion.class})
    public GlobalExceptionHandler(){

    }
}
