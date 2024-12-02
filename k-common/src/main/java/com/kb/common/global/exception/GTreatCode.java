package com.kb.common.global.exception;

public enum GTreatCode implements ITreatCode {

    SYSTEM_ERROR("SYSTEM_ERROR", "시스템 오류, IT 담당자 문의"),
    CONFIGURATION("APP_CONFIG_ERROR", "Application 환경설정 오류"),
    DATA_NOT_FOUND("DATA_NOT_FOUND", "Data 찾을 수 없음."),
    BLANK("", "");

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

    GTreatCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
