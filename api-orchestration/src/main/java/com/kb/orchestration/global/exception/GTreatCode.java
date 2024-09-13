package com.kb.orchestration.global.exception;

public enum GTreatCode implements ITreatCode{

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
