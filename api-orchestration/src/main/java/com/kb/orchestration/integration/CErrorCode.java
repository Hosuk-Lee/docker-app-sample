package com.kb.orchestration.integration;

import com.kb.orchestration.global.exception.IErrorCode;
import lombok.Builder;


public class CErrorCode implements IErrorCode {

    private final String code;
    private final String message;


    @Builder
    CErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
