package hs.sample.k.apiserver.global.response.exception;

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

  public BusinessException(ErrorCode errorCode, String meesage) {
    super(errorCode.getErrorStatus());
    this.errorCode = errorCode;
    errorCode.setErrorMessage(meesage);
  }

  public ErrorCode getErrorCode() {
    return errorCode;
  }
}
