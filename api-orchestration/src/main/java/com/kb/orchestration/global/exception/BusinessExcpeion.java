package com.kb.orchestration.global.exception;

public class BusinessExcpeion extends RuntimeException {

    private final IErrorCode errorCode;
    private final ITreatCode treatCode;
    private final String customMessage;

    public BusinessExcpeion(IErrorCode errorCode, ITreatCode treatCode, String customMessage) {
        this.errorCode = errorCode;
        this.treatCode = treatCode;
        this.customMessage = customMessage;
    }



}
