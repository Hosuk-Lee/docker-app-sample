package com.kb.common.global.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kb.common.global.exception.IErrorCode;
import com.kb.common.global.exception.ITreatCode;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponseDto {

    @JsonProperty("status_code")
    private  int statusCode;
    @JsonProperty("status")
    private  String status;

//    @JsonProperty("error")
//    private  String error;
    @JsonProperty("time")
    private  LocalDateTime time;
    @JsonProperty("error_code")
    private  String errorCode;
    @JsonProperty("error_message")
    private  String errorMessage;
    @JsonProperty("treat_code")
    private  String treatCode;
    @JsonProperty("treat_message")
    private  String treatMessage;
    @Setter
    private String stackTrace;
//    private List<ValidationError> validErrors;

    public ErrorResponseDto(){

    }

    @Builder
    public ErrorResponseDto(
        int statusCode, String status, LocalDateTime time,
            IErrorCode errorCode, ITreatCode treatCode) {
        this.statusCode = statusCode;
        this.status = status;
//        this.error = error;
        this.time = time;
        this.errorCode = errorCode.getCode();
        this.errorMessage = errorCode.getMessage();
        this.treatCode = treatCode.getCode();
        this.treatMessage = treatCode.getMessage();
    }

}
