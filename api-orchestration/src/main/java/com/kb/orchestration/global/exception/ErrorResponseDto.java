package com.kb.orchestration.global.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponseDto {

    private  int status;
    private  String error;
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
    public ErrorResponseDto(int status, String error, LocalDateTime time, IErrorCode errorCode,
            ITreatCode treatCode) {
        this.status = status;
        this.error = error;
        this.time = time;
        this.errorCode = errorCode.getCode();
        this.errorMessage = errorCode.getMessage();
        this.treatCode = treatCode.getCode();
        this.treatMessage = treatCode.getMessage();
    }

}
