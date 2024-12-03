package hs.sample.k.savings.global.response.advice;

import hs.sample.k.savings.model.HTTPError;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@RestControllerAdvice
@Slf4j
public class ExceptionControllerAdvice {

    //  @ExceptionHandler({
//          BusinessException.class
//  })
//  public ResponseEntity<CommonExternalResponse> BusinessException(
//          final BusinessException ex, final HttpServletRequest request) {
//      log.warn("error.. {}", ex.getMessage(), ex);
//      ErrorCode errorCode = ex.getErrorCode();
//
//      return ResponseEntity.status(errorCode.getHttpStatus())
//              .body(CommonExternalResponse.fail(ex.getErrorCode()));
//  }
    @ExceptionHandler({
        Exception.class
    })
    public ResponseEntity<HTTPError> exceptionHandler(
        final Exception ex, final HttpServletRequest request) {
        HTTPError httpError = new HTTPError()
            .statusCode("500")
            .message("Server Error")
            .status("500 Server Error");
        return ResponseEntity.status(HttpStatus.resolve(
                Integer.valueOf("500")
            ))
            .body(httpError);
    }

}
