package hs.sample.k.apiserver.global.response.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    CUSTOM_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "B9999999", "Contact IT team staff."),

    CONFLICT(HttpStatus.CONFLICT, "E0000001", "Conflict."),
    NOT_FOUND_MASTER(HttpStatus.BAD_REQUEST, "B9999999", "상품계약 Control Record 확인 불가. Contact IT team staff.");

    private final HttpStatus httpStatus;
    private final String errorCode;
    private final String errorMessage;
    ErrorCode(HttpStatus httpStatus , String errorCode, String errorMessage) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
