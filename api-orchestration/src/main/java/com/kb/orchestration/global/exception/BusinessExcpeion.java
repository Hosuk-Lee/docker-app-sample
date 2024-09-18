package com.kb.orchestration.global.exception;

import lombok.Getter;

@Getter
public class BusinessExcpeion extends RuntimeException {

    private final IErrorCode errorCode;
    private final ITreatCode treatCode;
    private final String customMessage;

    public BusinessExcpeion(IErrorCode errorCode, ITreatCode treatCode, String customMessage) {
        this.errorCode = errorCode;
        this.treatCode = treatCode;
        this.customMessage = customMessage;
    }
//    public BusinessExcpeion(ErrorResponseDto errorResponseDto, String customMessage) {
//        this.errorCode = errorResponseDto.getErrorCode();
//        this.treatCode = treatCode;
//        this.customMessage = customMessage;
//    }





}
