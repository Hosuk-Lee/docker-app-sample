package com.kb.common.global.exception;

import com.kb.common.global.exception.ITreatCode;

public enum GTreatCode implements ITreatCode {

    CONFIGURATION("APP_CONFIG_ERROR", "Application 환경설정 오류"),
    BLANK("","");

    private final String code;
    private final String message;

    @Override
    public String getCode() { return code; }

    @Override
    public String getMessage() { return message; }

    GTreatCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
