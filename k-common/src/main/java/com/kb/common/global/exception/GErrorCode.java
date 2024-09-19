package com.kb.common.global.exception;

import com.kb.common.global.exception.IErrorCode;

public enum GErrorCode implements IErrorCode {

    SYSTEM_LOCK("SYSTEM_LOCK", "시스템 가동 중지");

    private final String code;
    private final String message;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    GErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
