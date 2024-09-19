package com.kb.common.global.exception;

import com.kb.common.global.exception.ITreatCode;
import lombok.Builder;

public class CTreatCode implements ITreatCode {

    private final String code;
    private final String message;

    @Builder
    public CTreatCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return "";
    }

    @Override
    public String getMessage() {
        return "";
    }
}
