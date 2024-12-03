package hs.sample.k.savings.global.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CommonExternalResponse<T> {

    private T data;
    private String errorCode;
    private String message;

//    public static <T> CommonExternalResponse<T> success(T data, String message) {
//        return (CommonExternalResponse<T>) CommonExternalResponse.builder()
//                .data(data)
//                .message(message)
//                .build();
//    }
//
//    public static <T> CommonExternalResponse<T> success(T data) { return success(data, "success"); }
//
//    public static <T> CommonExternalResponse<T> fail(ErrorCode errorCode) {
//        return (CommonExternalResponse<T>) CommonExternalResponse.builder()
//                .message(errorCode.getErrorMessage())
//                .errorCode(errorCode.getErrorCode())
//                .build();
//    }


}
