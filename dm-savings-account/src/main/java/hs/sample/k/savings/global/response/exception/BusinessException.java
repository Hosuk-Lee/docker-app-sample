package hs.sample.k.savings.global.response.exception;

public class BusinessException extends RuntimeException {
//  private final int status;
  private final ErrorCode errorCode;
  private Object data;

  public BusinessException(ErrorCode errorCode) {
    super(errorCode.getErrorMessage());
    this.errorCode=errorCode;
    this.data = null;
  }
  
  public BusinessException(ErrorCode errorCode, Object data) {
    super(errorCode.getErrorMessage());
    this.errorCode = errorCode;
    this.data = data;
  }

  public ErrorCode getErrorCode() {
    return errorCode;
  }
}
