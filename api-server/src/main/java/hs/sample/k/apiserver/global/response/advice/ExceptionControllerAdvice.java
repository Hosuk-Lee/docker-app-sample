package hs.sample.k.apiserver.global.response.advice;

import hs.sample.k.apiserver.global.response.exception.BusinessException;
import hs.sample.k.apiserver.global.response.exception.ErrorCode;
import hs.sample.k.apiserver.model.HTTPError;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionControllerAdvice {

  @ExceptionHandler({
          BusinessException.class
  })
  public ResponseEntity<HTTPError> BusinessException(
          final BusinessException ex, final HttpServletRequest request) {
//      log.warn("error.. {}", ex.getMessage(), ex);
      log.warn("error.. {}", ex.getMessage());
      ErrorCode errorCode = ex.getErrorCode();
      HTTPError httpError = new HTTPError()
          .statusCode(errorCode.getErrorCode())
          .status(errorCode.getErrorStatus())
          .message(errorCode.getErrorMessage());

      return ResponseEntity.status(errorCode.getHttpStatus())
          .body(httpError);

//      return ResponseEntity.status(errorCode.getHttpStatus())
//              .body(CommonExternalResponse.fail(ex.getErrorCode()));
  }
    @ExceptionHandler({
            Exception.class
    })
    public ResponseEntity<HTTPError> exceptionHandler(
            final Exception ex, final HttpServletRequest request) {
        log.error("ERROR :: {}",ex.getMessage());
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
