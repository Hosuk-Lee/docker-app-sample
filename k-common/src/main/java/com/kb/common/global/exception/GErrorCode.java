package com.kb.common.global.exception;

public enum GErrorCode implements IErrorCode {

    SYSTEM_ERROR("SYSTEM_ERROR", "시스템 오류"),
    SYSTEM_LOCK("SYSTEM_LOCK", "시스템 가동 중지"),

    DB_DATA_NOT_FOUND("DB_DATA_NOT_FOUND", "데이터 찾을 수 없음"),
    ILLEGAL_ARGUMENT("ILLEGAL_ARGUMENT", "illegal argument exception");


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
